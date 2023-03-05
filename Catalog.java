package HW2OOP;

import java.util.*;

public class Catalog {
    
    private static List<Laptop> catalogLaptops;

    public Catalog() {
        this.catalogLaptops = new LinkedList<>();
    }

    public void addCatalog(Laptop laptop) {
        this.catalogLaptops.add(laptop);
    }

    public void showLaptop() {
        int count = 0;
        for (Laptop laptop : catalogLaptops) {
            System.out.println(laptop);
            count++;
        }
        System.out.printf("Результат поиска %d совпадений \n\n", count);
    }


    public static List<Laptop> getCatalog() {
        return  catalogLaptops;
    }
    
}
