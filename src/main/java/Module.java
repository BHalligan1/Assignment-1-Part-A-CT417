import java.util.ArrayList;

public class Module {

    private String moduleName, id;
    private ArrayList<Student> registeredStudents;
    private ArrayList<CourseProgramme> associatedProgrammes;
    private Lecturer responsibleLecturer;

    public Module(String moduleName, String id) {
        this.moduleName = moduleName;
        this.id = id;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getRegisteredStudents() {
        return registeredStudents;
    }

    public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    public ArrayList<CourseProgramme> getAssociatedProgrammes() {
        return associatedProgrammes;
    }

    public void setAssociatedProgrammes(ArrayList<CourseProgramme> associatedProgrammes) {
        this.associatedProgrammes = associatedProgrammes;
    }

    public Lecturer getResponsibleLecturer() {
        return responsibleLecturer;
    }

    public void setResponsibleLecturer(Lecturer responsibleLecturer) {
        this.responsibleLecturer = responsibleLecturer;
    }
}