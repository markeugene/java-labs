package com.company;

public class Main {

    public static void main(String[] args) {

        //создание объекта+ выделение памяти+вызов конструктор
        Stock i1 = new Stock();
        Stock i2 = new Stock();
        Stock i3 = new Stock();

        i1.SetName("first"); //поле нейм класса i1 становится =first
        i1.SetCost(1);   //i1.cost=1;
        i1.setAvailable(false);// i1.available=false

        // подобно i1
        i2.SetName("second");
        i2.SetCost(2);
        i2.setAvailable(true);
        // подобно i2
        i3.SetName("third");
        i3.SetCost(3);
        i3.setAvailable(true);

        // вывод информации об объектах
        i1.Print();
        i2.Print();
        i3.Print();


    }
}