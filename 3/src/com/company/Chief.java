package com.company;

public class Chief extends Employee{ // класс шеф наследуется от емплои
    private String name_c;// его поля
    private int amountof;

    Chief(String fio,boolean sex, String date, int exp, int salary,String name_c,int amountof){//конструктор
        super(fio,sex,date,exp,salary);//вызов конструктора суперкласса
        this.name_c=name_c;
        this.amountof=amountof;
    }

    //вывод полей.
    public void GetFio() {
        super.GetFio();//вызов метода суперкласса.
    }


    public void GetSex() {
        super.GetSex();
    }


    public void GetDate() {
        super.GetDate();
    }


    public void GetExp() {
        super.GetExp();
    }


    public void GetSalary() {
        super.GetSalary();
    }

    public int getAmountof() {
        return amountof;
    }

    public String getName_c() {
        return name_c;
    }

    public void Taxes()
    {
        System.out.println("Выплачиваемые налоги: "+salary*0.19);
    }


}