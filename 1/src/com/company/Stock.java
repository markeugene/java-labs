package com.company;

public class Stock {
    private String name;
    private int cost;
    private boolean available;


    // Сеттеры- при вызове заносят значение в поле класса.
    public void SetName(String name){
        this.name=name;
    }
    public void SetCost(int cost) {
        this.cost=cost;
    }
    public void setAvailable(boolean available){
        this.available=available;
    }
    public Stock()конструктор без параметров
    {
        this.name=null;
        this.cost=cost;
        this.available=false;
    }


    //Геттеры, при вызове возвращают значение определенного поля
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

    // Функция вывода полей класса
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
