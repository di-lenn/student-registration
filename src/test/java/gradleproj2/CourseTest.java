package gradleproj2;

import gradleproj1.Course;
import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourseTest {

    Course course;

    @BeforeEach
    void setUp() {
        course = new Course("4BCT", new DateTime("2021-8-29T00:00:00Z"), new DateTime("2022-8-28T23:59:59Z"));
    }

    @Test
    @DisplayName("Username generation should work")
    void testGetName() {
        assertEquals("4BCT", course.getName(),
                "Fetching name should work");
    }
}
