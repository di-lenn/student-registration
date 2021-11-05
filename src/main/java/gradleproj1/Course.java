package gradleproj1;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Course {

    private String name;
    private ArrayList<String> modules;
    private ArrayList<String> students;
    private DateTime startDate;
    private DateTime endDate;

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getModules() {
        return modules;
    }

    public void setModules(ArrayList<String> modules) {
        this.modules = modules;
    }

    public ArrayList<String> getStrings() {
        return students;
    }

    public void setStrings(ArrayList<String> students) {
        this.students = students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}