import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JobDataService {

    public static void FilterJobsByTitle(List<JobDetail> jobs) {
        System.out.println("===========================================");
        System.out.println("Filterring Data By Title");
        LinkedHashMap<String, Long> jobs_by_title = new LinkedHashMap<>();
        for (JobDetail job : jobs) {
            if(jobs_by_title.keySet().contains(job.getJobTitle()))
                jobs_by_title.put(job.getJobTitle(), jobs_by_title.get(job.getJobTitle()) + 1);
            else
                jobs_by_title.put(job.getJobTitle(), (long)1);
        }

        jobs_by_title = sortMap(jobs_by_title);
        jobs_by_title.forEach((title, pop) -> {
            System.out.println(title + " => " + pop);
        });
    }

    public static void FilterJobsByCountry(List<JobDetail> jobs) {
        System.out.println("===========================================");
        System.out.println("Filterring Data By Country");
        LinkedHashMap<String, Long> jobs_by_country = new LinkedHashMap<>();
        for (JobDetail job : jobs) {
            if(jobs_by_country.keySet().contains(job.getCountry()))
                jobs_by_country.put(job.getCountry(), jobs_by_country.get(job.getCountry()) + 1);
            else
                jobs_by_country.put(job.getCountry(), (long)1);
        }

        jobs_by_country = sortMap(jobs_by_country);
        jobs_by_country.forEach((country, pop) -> {
            System.out.println(country + " => " + pop);
        });
    }

    public static void FilterJobsByLevel(List<JobDetail> jobs) {
        System.out.println("===========================================");
        System.out.println("Filterring Data By Level");
        LinkedHashMap<String, Long> jobs_by_level = new LinkedHashMap<>();
        for (JobDetail job : jobs) {
            if(jobs_by_level.keySet().contains(job.getLevel()))
                jobs_by_level.put(job.getLevel(), jobs_by_level.get(job.getLevel()) + 1);
            else
                jobs_by_level.put(job.getLevel(), (long)1);
        }

        jobs_by_level = sortMap(jobs_by_level);
        jobs_by_level.forEach((level, pop) -> {
            System.out.println(level + " => " + pop);
        });
    }

    public static LinkedHashMap<String, Long> sortMap(Map<String, Long> map) {
        LinkedHashMap<String, Long> new_map = new LinkedHashMap<>();
        List<Map.Entry<String, Long>> list = new ArrayList<Map.Entry<String, Long>>(map.entrySet());
        list.sort((list1, list2) -> list1.getValue().compareTo(list2.getValue()));
        for (Map.Entry<String, Long> e : list) {
            new_map.put(e.getKey(), e.getValue());
        }
        return new_map;
    }

    public static void FilterJobsByYearsExp(List<JobDetail> jobs) {
        System.out.println("===========================================");
        System.out.println("Filterring Data By Years Of Experience");
        LinkedHashMap<String, Long> jobs_by_years = new LinkedHashMap<>();
        for (JobDetail job : jobs) {
            if(jobs_by_years.keySet().contains(job.getYearsOfExp()))
                jobs_by_years.put(job.getYearsOfExp(), jobs_by_years.get(job.getYearsOfExp()) + 1);
            else
                jobs_by_years.put(job.getYearsOfExp(), (long)1);
        }

        jobs_by_years = sortMap(jobs_by_years);
        jobs_by_years.forEach((years, pop) -> {
            System.out.println(years + " => " + pop);
        });
    }
}
