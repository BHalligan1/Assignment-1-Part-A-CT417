import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LecturerTests {

    @Test
    public void getUsername_ValidNameAndAge_ReturnsCorrectUsername() {
        // Arrange
        Lecturer lecturer = new Lecturer("TestName", 20, 1);

        // Act
        String result = lecturer.getUsername();

        // Assert
        assertEquals("TestName20", result);
    }
}