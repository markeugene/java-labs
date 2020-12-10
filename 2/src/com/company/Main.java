package com.company;

public class Main {

    public static void main(String[] args) {
        Stock []arr=new Stock[3];//выделение памяти под массив
        arr[0]=new Stock("first",1,true);//заполнение массива+выделение памяти под объект класса+вызов конструктор
        arr[1]=new Stock("second",2,true);
        arr[2]=new Stock("third",3,true);

        System.out.println("Общая стоимость товаров: "+Stock.Profit(arr));
        System.out.println("Количество товаров в наличие: "+ Stock.Amount(arr));
    }
}
