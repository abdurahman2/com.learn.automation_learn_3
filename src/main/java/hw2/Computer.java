package hw2;

/*
2.	Design such Java class with name Computer and such properties as:
-	Brand
-	Screen size
-	Number of cores
-	Type (laptop,desktop,etc.)
•	Make `Brand` and `Screen size` properties required in order to create an object(instance).
•	Create two auxiliary object of Computer class.
 */
public class Computer {
    private String brand;
    private int screenSize;
    private int numberOfCores;
    private String type;

    public Computer(String brand, int screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public Computer(String brand, int screenSize, int numberOfCores) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.numberOfCores = numberOfCores;
    }

    public Computer(String brand, int screenSize, String type) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}