package com.company;

public class Director extends Employee { //класс директор наследуется от емплоии
    private String dateof;/поле

    Director(String fio, boolean sex, String date, int exp,int salary,String dateof)//конструктор
    {
        super(fio, sex, date, exp, salary);//вызов конструктора суперкласса
        this.dateof=dateof;
    }

    //гетеры
    public void GetFio() {
        super.GetFio();
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

    public String getDateof() {
        return dateof;
    }

    public void Taxes(){
        System.out.println("Выплачиваемые налоги: "+salary*0.2);
    }
}