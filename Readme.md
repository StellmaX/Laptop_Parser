**Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.**

-Создать множество ноутбуков.
-Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.

**Например:**

Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
-Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
-Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
_____________________________________________________________________________________________________________________________

**Laptop**
Объект Laptop.java хронит в себе параметры ноубуков: RAM, HDD, OS, Colour. Заполняется из Laptop_info.java

**Laptop_info.java**
Хронит данные в виде ```Laptop("Model0", 8, 256, "Windows", "Gray")``` Нужна для запонения Laptop.java. 

**Laptop_stock.java**
Метод фильтраации ноубуков.

**Main**
Основное тело программы, содержит меню для задачи пораметров фильтрации.