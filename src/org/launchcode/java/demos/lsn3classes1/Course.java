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

    public String getCourseTitle() {
        return this.courseTitle;
    }

    public void setCourseTitle(String aCourseTitle) {
        this.courseTitle = aCourseTitle;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher aTeacher) {
        this.teacher = aTeacher;
    }

    public HashMap<String, Student> getRoster() {
        return this.roster;
    }

    public void setRoster(HashMap<String, Student> aRoster) {
        this.roster = aRoster;
    }

}
