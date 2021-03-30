package org.launchcode.java.demos.lsn3classes1;
import java.util.Map;
import java.util.HashMap;


public class Course {
    private String courseTitle;
    private Teacher teacher;
    private HashMap<String, Student> roster;

    public Course(String courseTitle, Teacher teacher, HashMap<String, Student> roster) {
        this.courseTitle = courseTitle;
        this.teacher = teacher;
        this.roster = roster;
    }


}
