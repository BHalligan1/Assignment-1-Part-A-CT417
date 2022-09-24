import org.joda.time.DateTime;

import java.util.ArrayList;

public class Student {

    private String name, username;
    private int age;
    private DateTime dob;
    private long id;
    private ArrayList<CourseProgramme> courses;
    private ArrayList<Module> modulesRegisteredFor;

    public Student(String name, int age, long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getUsername() {
        username = name + String.valueOf(age);
        return username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModulesRegisteredFor() {
        return modulesRegisteredFor;
    }

    public void setModulesRegisteredFor(ArrayList<Module> modulesRegisteredFor) {
        this.modulesRegisteredFor = modulesRegisteredFor;
    }
}