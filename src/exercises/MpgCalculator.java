package exercises;
import java.util.Scanner;

public class MpgCalculator {
    public static void main(String[] args) {
        double milesDriven;
        double gallonsUsed;
        double milesPerGallon;
        Scanner input;

        input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        milesDriven = input.nextInt();
        System.out.println("How many gallons of gas have you used?");
        gallonsUsed = input.nextInt();
        input.close();
        milesPerGallon = milesDriven/gallonsUsed;
        System.out.println("Your fuel efficiency is " + milesPerGallon + " Miles Per Gallon.");
    }
}
