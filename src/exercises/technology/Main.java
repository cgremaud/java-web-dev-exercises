package exercises.technology;
import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static String userChoice;
    private static String aMake;
    private static String aModel;
    private static String aProcessor;
    private static int aRam;
    private static String aDriveType;
    private static int aDriveStorage;
    private static String aScreenType;
    private static int aScreenSize;
    private static Laptop laptop;
    private static SmartPhone smartPhone;

    public static void main(String[] args) {
        laptop = new Laptop ("Toshiba", "Sattelite", "Core i5", 16, "HDD", 500, "IPS LCD", 15);
        System.out.println(laptop.printLaptopInfo());
        smartPhone = new SmartPhone("Samsung", "Galaxy", "ARM 6150", 36, "SIM Card", 16, "Touch", "Android");
        System.out.println(smartPhone.printSmartPhoneInfo());
//        System.out.println("Is your device a laptop or a smartphone?");
//        userChoice = in.nextLine();
//        in.nextLine();
//        if (userChoice == "laptop") {
//            System.out.println("Please enter the make");
//            aMake = in.nextLine();
//            System.out.println("Please enter the model");
//            aModel = in.nextLine();
//            System.out.println("Please enter the processor");
//            aProcessor = in.nextLine();
//            System.out.println("Please enter the amount of RAM in GB");
//            aRam = in.nextInt();
//            System.out.println("Please enter the type of drive storage (HDD or SDD)");
//            aDriveType = in.nextLine();
//            System.out.println("Please enter the amount of drive storage in GB");
//            aDriveStorage = in.nextInt();
//            System.out.println("Please enter the type of screen");
//            aScreenType = in.nextLine();
//            System.out.println("Please enter the screen size in in");
//            aScreenSize = in.nextInt();
//            laptop = new Laptop(aModel, aMake, aProcessor, aRam, aDriveType, aDriveStorage, aScreenType, aScreenSize);
//            System.out.println(laptop.printLaptopInfo());
//        } else {
//            return;
//        }
    }
}
