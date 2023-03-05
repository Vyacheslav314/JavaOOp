package HW2OOP;

import java.util.*;

public class Properties {

    public static Map<Integer, String> getPropertiesBrand(List<Laptop> listLaptops) {
        Map<Integer, String> listProperties = new HashMap<>();
        int count = 1;
        for (Laptop properties : listLaptops) {
            if (listProperties.containsValue(properties.getBrand()) == false) {
                listProperties.put(count, properties.getBrand());
                count++;
            }
        }
        return listProperties;
    }

    public static Map<Integer, String> getPropertiesColor(List<Laptop> listLaptops) {
        Map<Integer, String> listProperties = new HashMap<>();
        int count = 1;
        for (Laptop properties : listLaptops) {
            if (listProperties.containsValue(properties.getColor()) == false) {
                listProperties.put(count, properties.getColor());
                count++;
            }
        }
        return listProperties;
    }

    public static Map<Integer, String> getPropertiesHDD(List<Laptop> listLaptops) {
        Map<Integer, String> listProperties = new HashMap<>();
        int count = 1;
        for (Laptop properties : listLaptops) {
            if (listProperties.containsValue(properties.getHarDisk()) == false) {
                listProperties.put(count, properties.getHarDisk());
                count++;
            }
        }
        return listProperties;
    }

}
