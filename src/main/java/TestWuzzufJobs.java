import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.List;

public class TestWuzzufJobs {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        String path = "C:\\ITI AI Program\\Java\\Assignments\\Day 4\\Wuzzuf_Jobs.csv";
        try {
            List<JobDetail> jobs = JobsIO.ReadCSVFile(path);
            for (JobDetail job : jobs) {
                System.out.println(job.toString());
            }

            JobDataService.FilterJobsByTitle(jobs);
            JobDataService.FilterJobsByCountry(jobs);
            JobDataService.FilterJobsByLevel(jobs);
            JobDataService.FilterJobsByYearsExp(jobs);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
