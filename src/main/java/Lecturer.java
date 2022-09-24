import org.joda.time.DateTime;

import java.util.ArrayList;

public class Lecturer {

    private String name, username;
    private int age;
    private DateTime dob;
    private long id;
    private ArrayList<Module> modulesTeaching;

    public Lecturer(String name, int age, long id) {
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

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Module> getModulesTeaching() {
        return modulesTeaching;
    }

    public void setModulesTeaching(ArrayList<Module> modulesTeaching) {
        this.modulesTeaching = modulesTeaching;
    }
}