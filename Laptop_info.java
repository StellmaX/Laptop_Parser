package org.example.seminar.src.org.example.laptop;

import java.util.ArrayList;
import java.util.List;

// Добовляет информацию о ноутбуках
public class Laptop_info {
    public static List<Laptop> createLaptops() {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Model0", 8, 256, "Windows", "Gray"));
        laptops.add(new Laptop("Model1", 8, 256, "Windows", "Black"));
        laptops.add(new Laptop("Model2", 12, 1024, "Linux", "Black"));
        laptops.add(new Laptop("Model3", 12, 2048, "none", "Black"));
        laptops.add(new Laptop("Model4", 16, 512, "MacOS", "White"));
        laptops.add(new Laptop("Model5", 16, 2048, "Windows", "Gray"));
        laptops.add(new Laptop("Model6", 16, 2048, "Windows", "Silver"));
        laptops.add(new Laptop("Model7", 32, 2048, "Windows", "Silver"));
        return laptops;
    }
}