package gradleproj1;

import java.util.ArrayList;

public class Module {

    private String name;
    private int id;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String name, int id) {
        this.name = name;
        this.id = id;
        students = new ArrayList<Student>();
        courses = new ArrayList<Course>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
