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
}
