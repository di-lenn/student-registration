package gradleproj2;

import gradleproj1.Course;
import gradleproj1.Module;
import gradleproj1.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

//    Student student;

//    @BeforeEach
//    void setUp() {
//        student = new Student();
//    }

    @Test
    @DisplayName("Username generation should work")
     void testGetUsername() {
        Student instance = new Student();
        String expResult = "Jane19";
        instance.setName("Jane");
        instance.setAge(19);
        String result = instance.getUsername();
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Age retrieval should work")
     void testGetAge() {
        System.out.println("getAge");
        Student instance = new Student();
        int expResult = 28;
        instance.setAge(expResult);
        int result = instance.getAge();
        assertEquals(expResult, result);
    }
    
    @Test
    @DisplayName("Setting Date Of Birth should work")
     void testSetDob() {
        System.out.println("setDob");
        String dob = "12/11/1997";
        Student instance = new Student();
        instance.setDob(dob);
        assertEquals(dob, instance.getDob());
    }
    
    @Test
    @DisplayName("ID num retrieval should work")
     void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        int expResult = 18000;
        instance.setId(expResult);
        int result = instance.getId();
        assertEquals(expResult, result);
    }    
    
    @Test
    @DisplayName("Setting Course should work")
     void testSetCourses() {
        System.out.println("setCourses");
        ArrayList<Course> courses = new ArrayList<Course>();
        Course bct = new Course();
        courses.add(bct);
        Student instance = new Student();
        instance.setCourses(courses);
        assertEquals(courses,instance.getCourses());
    }

    @Test
    @DisplayName("List of Modules retrieval should work")
     void testGetModules() {
        System.out.println("getModules");
        Student instance = new Student();
        ArrayList<Module> expResult = new ArrayList<>();
        Module se3 = new Module();
        Module ml = new Module();
        expResult.add(se3);
        expResult.add(ml);
        instance.setModules(expResult);
        ArrayList<Module> result = instance.getModules();
        assertEquals(expResult, result);
    }
}
