package exercises.technology;

public class SmartPhone extends Computer{
    private String screenType;
    private String operatingSystem;

    public SmartPhone(String make, String model, String processor, int ram, String driveType, int driveStorage, String screenType, String operatingSystem) {
        super(make, model, processor, ram, driveType, driveStorage);
        this.screenType = screenType;
        this.operatingSystem = operatingSystem;

    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String printSmartPhoneInfo() {
        return "The " + getMake() + getModel() + "Specs: \n" +
                "Processor: " + getProcessor() + ".\n" + "RAM: " + getRam() + " GB \n" +
                "Storage Type: " + getDriveType() + "\n" + "Storage Amount: " + getDriveStorage() + " GB \n" +
                "Screen Type: " + getScreenType() + "\n " + "Operating System: " + getOperatingSystem();
    }
}

