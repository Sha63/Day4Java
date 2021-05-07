import java.util.Arrays;

public class JobDetail {
    private String jobTitle;
    private String companyName;
    private String companyLocation;
    private String type;
    private String level;
    private String yearsOfExp;
    private String country;
    private String[] Skills;

    public JobDetail(String jobTitle, String companyName, String companyLocation, String type, String level, String yearsOfExp, String country, String[] skills) {
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.companyLocation = companyLocation;
        this.type = type;
        this.level = level;
        this.yearsOfExp = yearsOfExp;
        this.country = country;
        Skills = skills;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(String yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getSkills() {
        return Skills;
    }

    public void setSkills(String[] skills) {
        Skills = skills;
    }

    @Override
    public String toString() {
        return "JobDetail{" +
                "jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyLocation='" + companyLocation + '\'' +
                ", type='" + type + '\'' +
                ", level='" + level + '\'' +
                ", yearsOfExp='" + yearsOfExp + '\'' +
                ", country='" + country + '\'' +
                ", Skills=" + Arrays.toString(Skills) +
                '}';
    }
}
