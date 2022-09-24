import org.joda.time.DateTime;

import java.util.ArrayList;

public class CourseProgramme {

    private String courseName;
    private ArrayList<Module> modules;
    private ArrayList<Student> enrolledStudents;
    private DateTime academicStartDate, academicEndDate;

    public CourseProgramme(String courseName, ArrayList<Module> modules, ArrayList<Student> enrolledStudents, DateTime academicStartDate, DateTime academicEndDate) {
        this.courseName = courseName;
        this.modules = modules;
        this.enrolledStudents = enrolledStudents;
        this.academicStartDate = academicStartDate;
        this.academicEndDate = academicEndDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public DateTime getAcademicStartDate() {
        return academicStartDate;
    }

    public void setAcademicStartDate(DateTime academicStartDate) {
        this.academicStartDate = academicStartDate;
    }

    public DateTime getAcademicEndDate() {
        return academicEndDate;
    }

    public void setAcademicEndDate(DateTime academicEndDate) {
        this.academicEndDate = academicEndDate;
    }
}