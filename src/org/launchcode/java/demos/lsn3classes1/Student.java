package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    //constructor
    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    //getters and setters
    String getName() {
        return this.name;
    }
    void setName(String aName) {
        this.name = aName;
    }
    int getStudentId() {
        return this.studentId;
    }
    void setStudentId(int aStudentId) {
        this.studentId = aStudentId;
    }
    int getNumberOfCredits() {
        return this.numberOfCredits;
    }
    void setNumberOfCredits(int aNumCredits) {
        this.numberOfCredits = aNumCredits;
    }

    public String getGradeLevel() {
        if (numberOfCredits <= 29) {
            return "Freshman";
        } else if (numberOfCredits >30 && numberOfCredits <= 59) {
            return "Sophomore";
        } else if (numberOfCredits > 59 && numberOfCredits <= 89) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    public void addGrade(double courseCredits, int gradePoints) {

        numberOfCredits += courseCredits;
        double qualityScore = courseCredits * gradePoints;
        double totalQualityScore = gpa * numberOfCredits;
        double newTotalQualityScore = totalQualityScore + qualityScore;
        gpa = newTotalQualityScore/numberOfCredits;

    }

}