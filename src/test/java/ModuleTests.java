import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ModuleTests {

    private Module module;

    @BeforeEach
    public void SetUp() {
        module = new Module(null, null);
    }

    @Test
    public void getSetModuleName_PassedAValidModuleName_ReturnsModuleName() {
        module.setModuleName("Software III");
        String result = module.getModuleName();
        assertEquals("Software III", result);
    }

    @Test
    public void getSetId_PassedAValidId_ReturnsId() {
        module.setId("CT417");
        String result = module.getId();
        assertEquals("CT417", result);
    }

    @Test
    public void getSetRegisteredStudents_PassedAValidArrayListOfStudents_ReturnsArrayListOfRegisteredStudents() {
        Student testStudentOne = null;
        Student testStudentTwo = null;
        Student testStudentThree = null;
        ArrayList<Student> testStudentList = new ArrayList<>(Arrays.asList(testStudentOne, testStudentTwo, testStudentThree));

        module.setRegisteredStudents(testStudentList);
        ArrayList<Student> result = module.getRegisteredStudents();

        assertEquals(3, result.size());
    }

    @Test
    public void getSetAssociatedProgrammes_PassedAValidArrayListOfCourseProgrammes_ReturnsArrayListOfAssociatedProgrammes() {
        CourseProgramme testCourseProgrammeOne = null;
        CourseProgramme testCourseProgrammeTwo = null;
        CourseProgramme testCourseProgrammeThree = null;
        ArrayList<CourseProgramme> testCourseProgrammeList = new ArrayList<>(Arrays.asList(testCourseProgrammeOne, testCourseProgrammeTwo, testCourseProgrammeThree));

        module.setAssociatedProgrammes(testCourseProgrammeList);
        ArrayList<CourseProgramme> result = module.getAssociatedProgrammes();

        assertEquals(3, result.size());
    }

    @Test
    public void getSetResponsibleLecturer_PassedAValidLecturer_ReturnsResponsibleLecturer() {
        Lecturer testLecturer = new Lecturer("Brendan Halligan", 20, 1);
        module.setResponsibleLecturer(testLecturer);

        Lecturer result = module.getResponsibleLecturer();
        assertEquals(testLecturer, result);
    }
}
