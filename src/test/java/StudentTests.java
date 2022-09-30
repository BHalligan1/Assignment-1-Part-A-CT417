import org.aspectj.lang.annotation.Before;
import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceArray;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTests {

    private Student student;

    @BeforeEach
    public void InstantiateStudent() {
        student = new Student("Brendan Halligan", 20, 1);
    }

    @Test
    public void getUsername_ValidNameAndAge_ReturnsCorrectUsername() {
        String result = student.getUsername();
        assertEquals("Brendan Halligan20", result);
    }

    @Test
    public void getSetName_PassedAValidName_ReturnsName() {
        student.setName("First Last");
        String result = student.getName();
        assertEquals("First Last", result);
    }

    @Test
    public void getSetAge_PassedAValidAge_ReturnsAge() {
        student.setAge(30);
        int result = student.getAge();
        assertEquals(30, result);
    }

    @Test
    public void getSetId_PassedAValidId_ReturnsId() {
        student.setId(10);
        long result = student.getId();
        assertEquals(10, result);
    }

    @Test
    public void getSetDob_PassedAValidDob_ReturnsDob() {
        student.setDob(new DateTime("10-10-02"));
        DateTime result = student.getDob();
        assertEquals(DateTime.parse("10-10-02"), result);
    }

    @Test
    public void getSetCourses_PassedAValidArrayListOfCourses_ReturnsCourses() {
        CourseProgramme testCourseOne = null;
        CourseProgramme testCourseTwo = null;
        CourseProgramme testCourseThree = null;
        ArrayList<CourseProgramme> testCourseList = new ArrayList<>(Arrays.asList(testCourseOne, testCourseTwo, testCourseThree));

        student.setCourses(testCourseList);
        ArrayList<CourseProgramme> result = student.getCourses();

        assertEquals(3, result.size());
    }

    @Test
    public void getSetModulesRegisteredFor_PassedAValidModule_ReturnsModulesRegisteredFor() {
        Module testModuleOne = null;
        Module testModuleTwo = null;
        Module testModuleThree = null;
        ArrayList<Module> testModuleList = new ArrayList<>(Arrays.asList(testModuleOne, testModuleTwo, testModuleThree));

        student.setModulesRegisteredFor(testModuleList);
        ArrayList<Module> result = student.getModulesRegisteredFor();

        assertEquals(3, result.size());
    }
}