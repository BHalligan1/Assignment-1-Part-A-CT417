import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class LecturerTests {

    private Lecturer lecturer;

    @BeforeEach
    public void SetUp() {
        lecturer = new Lecturer("Brendan Halligan", 20, 1);
    }

    @Test
    public void getUsername_ValidNameAndAge_ReturnsCorrectUsername() {
        String result = lecturer.getUsername();
        assertEquals("Brendan Halligan20", result);
    }

    @Test
    public void getSetName_PassedAValidName_ReturnsName() {
        lecturer.setName("First Last");
        String result = lecturer.getName();
        assertEquals("First Last", result);
    }

    @Test
    public void getSetAge_PassedAValidAge_ReturnsAge() {
        lecturer.setAge(30);
        int result = lecturer.getAge();
        assertEquals(30, result);
    }

    @Test
    public void getSetId_PassedAValidId_ReturnsId() {
        lecturer.setId(10);
        long result = lecturer.getId();
        assertEquals(10, result);
    }

    @Test
    public void getSetDob_PassedAValidDob_ReturnsDob() {
        lecturer.setDob(new DateTime("10-10-02"));
        DateTime result = lecturer.getDob();
        assertEquals(DateTime.parse("10-10-02"), result);
    }

    @Test
    public void getSetModulesTeaching_PassedAValidArrayListOfModules_ReturnsCourses() {
        Module testModuleOne = null;
        Module testModuleTwo = null;
        Module testModuleThree = null;
        ArrayList<Module> testModuleList = new ArrayList<>(Arrays.asList(testModuleOne, testModuleTwo, testModuleThree));

        lecturer.setModulesTeaching(testModuleList);
        ArrayList<Module> result = lecturer.getModulesTeaching();

        assertEquals(3, result.size());
    }
}