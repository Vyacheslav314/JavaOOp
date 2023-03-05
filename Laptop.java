package HW2OOP;

public class Laptop {

    String brand;
    double screenDiagonal;
    String color;
    int ram;
    String hardDisk;
    int price;
    
    public Laptop(String brand, double screenDiagonal, String color, int ram, String hardDisk, int price) {
        this.brand = brand;
        this.screenDiagonal = screenDiagonal;
        this.color = color;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }


    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public String getColor() {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public String getHarDisk() {
        return hardDisk;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("бренд: %s\nдиагональ: %s\nцвет: %s\nОЗУ: %d\nЖД: %s\nцена: %d\n", 
        brand, screenDiagonal, color, ram, hardDisk, price);
    }
}
