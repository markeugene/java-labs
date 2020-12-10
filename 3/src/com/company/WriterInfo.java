package com.company;

public class WriterInfo {

    public static void main(String[] args) {

        Employee e1 = new Employee("name", true, "1", 1, 1);//выделяем память под объект класса и вызываем констуктор
        Worker w1 = new Worker("kek", false, "2", 2, 2, 2, 2);
        Chief c1 = new Chief("chief", false, "3", 3, 3, "3", 3);
        Director d1 = new Director("dir", true, "4", 4, 4, "4");
        e1.Taxes();//вывод выплачиваемых налогов
        w1.Taxes();
        c1.Taxes();
        d1.Taxes();


    }
}
