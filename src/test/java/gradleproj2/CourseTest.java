package gradleproj2;

import gradleproj1.Course;
import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {

//    Course course;
//
//    @BeforeEach
//    void setUp() {
//        course = new Course();
//    }

    @Test
    @DisplayName("Get Start Date should work")
    public void testGetStartDate() {
        Course instance = new Course();
        DateTime expResult = new DateTime(2021,8,29,0,0);
        instance.setStartDate(expResult);
        DateTime result = instance.getStartDate();
        assertEquals(expResult, result);
    }

    @Test
    @DisplayName("Set End Date should work")
    public void testSetEndDate() {
        DateTime endDate = new DateTime(2022,8,28,23,59);
        Course instance = new Course();
        instance.setEndDate(endDate);
        assertEquals(endDate,instance.getEndDate());
    }
}
