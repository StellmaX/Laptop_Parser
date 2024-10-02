package org.example.seminar.src.org.example.laptop;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop_stock store = new Laptop_stock(); // создаем  хранилище
        List<Laptop> laptops = Laptop_info.createLaptops(); // создаем ноутбуки в Laptop_info
        for (Laptop laptop : laptops) {
            store.addLaptop(laptop); // добавляем ноутбуи в хранилище
        }

        Scanner scanner = new Scanner(System.in);
        Map<Integer, Object> filters = new HashMap<>();// фильтр для поиска
        while (true) {
            System.out.println("*******************************************");
            System.out.println("Укажите параметры поиска, \nВведите цифру для выбора.\n" +
                    "Если ничего не найдено - сбросьте фильтр.\n" +
                    "*******************************************");
            System.out.println("1 - RAM");
            System.out.println("2 - HDD size");
            System.out.println("3 - OS");
            System.out.println("4 - Colour");
            System.out.println("5 - Сброс фильтра");
            System.out.println("6 - Показать все ноуты");
            System.out.println("0 - Выход");
            System.out.println("*******************************************");
            int choice;
            while (true) { // проверяем ввод на числа
                try {
                    choice = scanner.nextInt();
                    scanner.nextLine();
                    break; 
                } catch (InputMismatchException e) {// неверный ввод
                    System.out.println("Введите ЧИСЛО.");
                    scanner.next(); 
                }
            }

            if (choice == 0) {
                System.out.println("Выход из программы.");
                break;
            } else if (choice == 5) {
                filters.clear(); 
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Укажите минимальное значение RAM(GB): ");
                    int minRam = scanner.nextInt();
                    filters.put(1, minRam);
                    break;
                case 2:
                    System.out.println("Укажите минимальное значение HDD(GB): ");
                    int minStorage = scanner.nextInt();
                    filters.put(2, minStorage);
                    break;
                case 3:
                    System.out.println("Укажите OS: ");
                    String os = scanner.next();
                    filters.put(3, os);
                    break;
                case 4:
                    System.out.println("Укажите цвет: ");
                    String colour = scanner.next();
                    filters.put(4, colour);
                    break;
                case 6:
                    filters.clear(); // очищаем фильтр
                    break;
                default:
                    System.out.println("Неверный выбор.");
                    continue;
            }
                Set<Laptop> fLaptops = store.filterLaptops(filters);
                System.out.println("============================================");
                for (Laptop laptop : fLaptops) {
                    System.out.println(laptop);
                }
                System.out.println("============================================");
                System.out.println("Всего: " + fLaptops.size()+" выбрано.");
                System.out.println("============================================");
                System.out.println("\n");
            }
        }
    }

