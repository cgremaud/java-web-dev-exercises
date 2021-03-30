package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    String firstName;
    String lastName;
    int yearsTeaching;
    String department;

    public Teacher(String firstName, String lastName, int yearsTeaching, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsTeaching = yearsTeaching;
        this.department = department;
    }

    public String getName(){
        return this.firstName + this.lastName;
    }

    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public int getYearsTeaching() {
        return this.yearsTeaching;
    }

    public void setYearsTeaching(int aYearsTeaching) {
        this.yearsTeaching = aYearsTeaching;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String aDepartment) {
        this.department = aDepartment;
    }

}
