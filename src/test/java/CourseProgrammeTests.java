import org.joda.time.DateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CourseProgrammeTests {

    private CourseProgramme courseProgramme;

    @BeforeEach
    public void SetUp() {
        Student testStudent = new Student("Brendan Halligan", 20, 1);
        ArrayList<Student> testStudentList = new ArrayList<>(Arrays.asList(testStudent));

        DateTime testStartDate = new DateTime("09-01-22");
        DateTime testEndDate = new DateTime("05-01-23");

        courseProgramme = new CourseProgramme(null, null, null, null, null);
    }

    @Test
    public void getSetCourseName_PassedValidName_ReturnsName() {
        courseProgramme.setCourseName("ECE");
        String result = courseProgramme.getCourseName();
        assertEquals("ECE", result);
    }

    @Test
    public void getSetModules_PassedValidArrayListOfModules_ReturnsArrayListOfModules() {
        Module testModuleOne = null;
        Module testModuleTwo = null;
        Module testModuleThree = null;
        ArrayList<Module> testModuleList = new ArrayList<>(Arrays.asList(testModuleOne, testModuleTwo, testModuleThree));

        courseProgramme.setModules(testModuleList);
        ArrayList<Module> result = courseProgramme.getModules();

        assertEquals(3, result.size());
    }

    @Test
    public void getSetEnrolledStudents_PassedAValidArrayListOfStudents_ReturnsArrayListOfEnrolledStudents() {
        Student testStudentOne = null;
        Student testStudentTwo = null;
        Student testStudentThree = null;
        ArrayList<Student> testStudentList = new ArrayList<>(Arrays.asList(testStudentOne, testStudentTwo, testStudentThree));

        courseProgramme.setEnrolledStudents(testStudentList);
        ArrayList<Student> result = courseProgramme.getEnrolledStudents();

        assertEquals(3, result.size());
    }

    @Test
    public void getSetAcademicStartDate_PassedAValidDateTime_ReturnsAcademicStartDate() {
        DateTime testStartDate = DateTime.parse("01-09-22");
        courseProgramme.setAcademicStartDate(testStartDate);

        DateTime result = courseProgramme.getAcademicStartDate();
        assertEquals(testStartDate, result);
    }

    @Test
    public void getSetAcademicEndDate_PassedAValidDateTime_ReturnsAcademicEndDate() {
        DateTime testStartDate = DateTime.parse("01-05-23");
        courseProgramme.setAcademicStartDate(testStartDate);

        DateTime result = courseProgramme.getAcademicStartDate();
        assertEquals(testStartDate, result);
    }
}
