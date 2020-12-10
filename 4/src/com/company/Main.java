package com.company;

public class Main {

    public static void main(String[] args) {
    Turner t11=new Turner("Kek",false,"lol",10,11);//выделение памяти + тест методов
    t11.print();
    t11.SetFio("LOL");
    t11.print();

    Locksmith l1=new Locksmith("locksmith",true,"locksmith",1,1);
    l1.SetExp(100);
    l1.print();

    Director d1=new Director("director",true,"director",001,001,"25 01 2002");
    d1.print();
    d1.SetDateof("0000000");
    d1.print();


    }
}
