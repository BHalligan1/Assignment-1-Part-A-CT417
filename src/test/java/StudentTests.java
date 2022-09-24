import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTests {

    @Test
    public void getUsername_ValidNameAndAge_ReturnsCorrectUsername() {
        // Arrange
        Student student = new Student("TestName", 20, 1);

        // Act
        String result = student.getUsername();

        // Assert
        assertEquals("TestName20", result);
    }
}