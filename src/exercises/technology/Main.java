package exercises.technology;
import java.util.Scanner;

public class Main {
    private Scanner in;
    private String userChoice;
    private String aMake;
    private String aModel;
    private String aProcessor;
    private int aRam;
    private String aDriveType;
    private int aDriveStorage;
    private String aScreenType;
    private int aScreenSize;
    Laptop laptop;





    public void main(String[] args) {
        System.out.println("Is your device a laptop or a smartphone?");
        userChoice = in.nextLine();
        if (userChoice == "laptop") {
            System.out.println("Please enter the make");
            aMake = in.nextLine();
            System.out.println("Please enter the model");
            aModel = in.nextLine();
            System.out.println("Please enter the processor");
            aProcessor = in.nextLine();
            System.out.println("Please enter the amount of RAM in GB");
            aRam = in.nextInt();
            System.out.println("Please enter the type of drive storage (HDD or SDD)");
            aDriveType = in.nextLine();
            System.out.println("Please enter the amount of drive storage in GB");
            aDriveStorage = in.nextInt();
            System.out.println("Please enter the type of screen");
            aScreenType = in.nextLine();
            System.out.println("Please enter the screen size in in");
            aScreenSize = in.nextInt();
            laptop = new Laptop(aModel, aMake, aProcessor, aRam, aDriveType, aDriveStorage, aScreenType, aScreenSize);
            System.out.println(laptop.printLaptopInfo());
        }
    }
}
