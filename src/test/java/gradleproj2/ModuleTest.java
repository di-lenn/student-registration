package gradleproj2;

import gradleproj1.Module;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuleTest {

//    Module module;
//
//    @BeforeEach
//    void setUp() {
//        module = new Module();
//    }

    @Test
    @DisplayName("Name set should work")
    public void testSetName() {
        String name = "Machine Learning";
        Module instance = new Module();
        instance.setName(name);
        assertEquals(name,instance.getName());
    }

    @Test
    @DisplayName("Course List retrieval should work")
    public void testGetCourses() {
        Module instance = new Module();
        ArrayList<String> expResult = new ArrayList<>();
        expResult.add("BCT");
        expResult.add("DS&T");
        instance.setCourses(expResult);
        ArrayList<String> result = instance.getCourses();
        assertEquals(expResult, result);
    }
}
