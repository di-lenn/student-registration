package gradleproj1;

import java.util.ArrayList;

public class Module {

    private String name;
    private int id;
    private ArrayList<Student> students;
    private ArrayList<String> courses;

    public Module() {

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

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Module{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", students=" + students +
                ", courses=" + courses +
                '}';
    }
}
