import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class JobsIO {

    public static List<JobDetail> ReadCSVFile(String path) throws Exception {
        Reader reader = new BufferedReader(new FileReader(path));
        CSVParser parser = new CSVParserBuilder()
                .withSeparator(',')
                .withIgnoreQuotations(false)
                .build();
        CSVReader csvReader = new CSVReaderBuilder(reader)
                .withSkipLines(0)
                .withCSVParser(parser)
                .build();
        List<String[]> list = new ArrayList<>();
        list = csvReader.readAll();
        reader.close();
        csvReader.close();
        List<JobDetail> jobs = new ArrayList<>();
        for (String[] strings : list) {
            JobDetail job = new JobDetail(strings[0], strings[1], strings[2], strings[3], strings[4], strings[5], strings[6], strings[7].split(","));
            jobs.add(job);
        }
        return jobs;
    }
}
