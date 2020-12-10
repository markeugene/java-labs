package com.company;

public class Stock {
    private String name;
    private int cost;//поля
    private boolean available;

    Stock(String name,int cost,boolean available)//конструктор с 3емя параметрами
    {
        this.name=name;
        this.cost=cost;
        this.available=available;
    }

    Stock(String name,int cost)// с 2умя
    {
        this.name=name;
        this.cost=cost;
    }

    Stock(){
        this.name=null;
        this.cost=0;
        this available=false};//конструктор без параметров
    //сеттеры, заполняет определенное поле класса

    public void SetName(String name){
        this.name=name;
    }
    public void SetCost(int cost) {
        this.cost=cost;
    }
    public void setAvailable(boolean available){
        this.available=available;
    }


    //геттеры возвращают определенное поле класса
    public String getName()
    {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public int getCost() {
        return cost;
    }

    //статическая ф-я которая возвращает общую стоимость товаров
    public static int Profit(Stock []arr )
    {
        int sum=0;
        for(int i=0;i<3;i++)
        {
            sum+=arr[i].cost;
        }
        return sum;
    }
    //статическая функция которая возвращает кол-во товаров в наличии
    public static int Amount(Stock []arr){

        int s=0;
        for(int i=0;i<3;i++){
            if(arr[i].available==true){
                s++;
            }
        }
        return s;
    }

    //ф-ая вывода

    public void Print(){
        System.out.println("Название: "+name);
        System.out.println("Стоимость:"+cost);
        if(available){
            System.out.println("Есть в наличии.");
        }
        else{
            System.out.println("Нет в наличии.");
        }

    }
}
