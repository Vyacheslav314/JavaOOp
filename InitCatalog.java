package HW2OOP;


public class InitCatalog extends Catalog {
    
    public static void createCatalog() {
        Laptop laptop1 = new Laptop("Lenovo", 16.8, "black", 1024, "HDD", 35000);
        Laptop laptop2 = new Laptop("Acer", 18, "Gray", 2048, "SSD", 45000);
        Laptop laptop3 = new Laptop("Dell", 14.3, "Gray", 4096, "SSD", 100000);
        Laptop laptop4 = new Laptop("Apple", 16.8, "Silver", 2048, "SSD", 350000);
        Laptop laptop5 = new Laptop("Asus", 22, "black", 4096, "HDD", 55000);
        Catalog catalog = new Catalog();
        catalog.addCatalog(laptop1);
        catalog.addCatalog(laptop2);
        catalog.addCatalog(laptop3);
        catalog.addCatalog(laptop4);
        catalog.addCatalog(laptop5);
    }
}
