package gradleproj2;

import gradleproj1.Module;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuleTest {

    Module module;

    @BeforeEach
    void setUp() {
        module = new Module("Software Engineering III", 417);
    }

    @Test
    @DisplayName("Username generation should work")
    void testGetID() {
        assertEquals(417, module.getId(),
                "Fetching module ID should work");
    }
}
