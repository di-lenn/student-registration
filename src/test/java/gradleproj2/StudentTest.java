package gradleproj2;

import gradleproj1.Student;
import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student("John", 18, new DateTime("2001-02-06T00:00:00Z"), 1);
    }

    @Test
    @DisplayName("Username generation should work")
    void testGetUsername() {
        assertEquals("John18", student.getUsername(),
                "Username generation should work");
    }
}
