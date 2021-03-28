package exercises;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Integer newStudentId;
        String newStudentName;

        System.out.println("Enter your students (or press ENTER to quit): ");

        do {
            System.out.println("Student Name (ENTER to quit): ");
            newStudentName = input.nextLine();
            if (!newStudentName.equals("")) {
                System.out.println("Student ID: ");
                newStudentId = input.nextInt();
                input.nextLine();
                students.put(newStudentId, newStudentName);
            }

        } while(!newStudentName.equals(""));

        for (Map.Entry<Integer, String> student: students.entrySet()) {
            System.out.println("Student ID: " + student.getKey() + " Student Name: " + student.getValue());
        }
    }
}
