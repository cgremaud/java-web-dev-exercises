package exercises.technology;

public class Computer {
    private String make;
    private String model;
    private String processor;
    private int ram;
    private String driveType;
    private int driveStorage;

    public Computer(String make, String model, String processor, int ram, String driveType, int driveStorage) {
        this.make = make;
        this.model = model;
        this.processor = processor;
        this.ram = ram;
        this.driveType = driveType;
        this.driveStorage = driveStorage;
    }

    public String printBasicInfo() {
        return  "Make: " + make + "Model: " +model + "\n" + "Processor: " + processor + "RAM: " + ram + " GB" + "\n" +
                "Type of Storage: " + driveType + "Amount of Storage: " + driveStorage + "\n";
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public int getDriveStorage() {
        return driveStorage;
    }

    public void setDriveStorage(int driveStorage) {
        this.driveStorage = driveStorage;
    }
}
