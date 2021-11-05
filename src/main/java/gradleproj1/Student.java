package gradleproj1;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private DateTime dob;
    private float id;
    private String username;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

    public Student(String name, int age, DateTime dob, float id) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        username = name + age;
        modules = new ArrayList<Module>();
        courses = new ArrayList<Course>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
