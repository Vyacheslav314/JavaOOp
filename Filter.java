package HW2OOP;

import java.util.*;

public class Filter  {
    
    public static Scanner scan = new Scanner(System.in);
    
    public static void filterValues(List<Laptop> listLatops, int key) {
        System.out.println("Укажите минимальное значение: ");
        double minValues = scan.nextInt();
        System.out.println("Укажите максимальное значение: ");
        double maxValues = scan.nextInt();
        int count = 0;
        if (key == 2) {
            for (Laptop prooerties : listLatops) {
                if (prooerties.getScreenDiagonal() >= minValues && prooerties.getScreenDiagonal() <= maxValues) {
                    count++;
                    System.out.println(prooerties.toString());
                }
            }
        } else if (key == 4) {
            for (Laptop prooerties : listLatops) {
                if (prooerties.getRam() >= minValues && prooerties.getRam() <= maxValues) {
                    count++;
                    System.out.println(prooerties.toString());
                }
            }
        } else if (key == 7) {
            for (Laptop prooerties : listLatops) {
                if (prooerties.getPrice() >= minValues && prooerties.getPrice() <= maxValues) {
                    count++;
                    System.out.println(prooerties.toString());
                }
            }
        }
        if (count == 0) {
            System.out.println("Ничего не найдено попробуй указать другие критерии: ");
        } else {
            System.out.printf("Количество совпадений %d \n\n", count);
        }
    }

    public static void filterBrand(Map<Integer, String> map, int command, List<Laptop> laptops) {
        int count = 0;
        for (Laptop prooerties : laptops) {
            if (prooerties.getBrand().equals(map.get(command))) {
                count++;
                System.out.println(prooerties.toString());
            }
        }
        if (count == 0) {
            System.out.println("Ничего не найдено попробуй указать другие критерии: ");
        } else {
            System.out.printf("Количество совпадений %d \n\n", count);
        }      
    }

    public static void filterColor(Map<Integer, String> map, int command, List<Laptop> laptops) {
        int count = 0;
        for (Laptop prooerties : laptops) {
            if (prooerties.getColor().equals(map.get(command))) {
                count++;
                System.out.println(prooerties.toString());
            }
        }
        if (count == 0) {
            System.out.println("Ничего не найдено попробуй указать другие критерии: ");
        } else {
            System.out.printf("Количество совпадений %d \n\n", count);
        }      
    }

    public static void filterHDD(Map<Integer, String> map, int command, List<Laptop> laptops) {
        int count = 0;
        for (Laptop prooerties : laptops) {
            if (prooerties.getHarDisk().equals(map.get(command))) {
                count++;
                System.out.println(prooerties.toString());
            }
        }
        if (count == 0) {
            System.out.println("Ничего не найдено попробуй указать другие критерии: ");
        } else {
            System.out.printf("Количество совпадений %d \n\n", count);
        }    
    }


}
