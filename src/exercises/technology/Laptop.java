package exercises.technology;

import java.util.Scanner;

public class Laptop extends Computer{
    private String screenType;
    private int screenSize;
    private Scanner in;


    public Laptop(String make, String model, String processor, int ram, String driveType, int driveStorage, String screenType, int screenSize) {
        super(make, model, processor, ram, driveType, driveStorage);
        this.screenType = screenType;
        this.screenSize = screenSize;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

}

