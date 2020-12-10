package com.company;

public class Employee {
    private String fio;
    private  boolean sex;
    private String date;
    private int exp;
    public int salary;

    Employee(){ // конструктор без параметров
        this.fio=null
        this.sex=false;
        this.date=null;
        this.exp=0;
        this.salary=0
    };
    Employee(String fio, boolean sex, String date, int exp,int salary){// констуктор
        this.fio=fio;
        this.sex=sex;
        this.date=date;
        this.exp=exp;
        this.salary=salary;
    }
    public void GetFio(){//вывод полей по запросу( ГЕТТЕРЫ)
        System.out.println("Фамилия Имя Отчество: "+this.fio);
    }
    public void GetSex() {
        System.out.println("Пол: "+this.sex);
    }
    public void GetDate(){
        System.out.println("Дата рождения: "+this.date);
    }
    public void GetExp(){
        System.out.println("Опыт работы: "+this.exp);
    }
    public void GetSalary(){
        System.out.println("Зарпалат: "+this.salary);
    }

    //СЕТТЕРЫ

    public void SetFio(String fio){
        this.fio=fio;}
    public void SetSex(boolean sex){
        this.sex=sex;}
    public void SetDate(String date){
        this.date=date;}
    public void SetExp(int exp){
        this.exp=exp;}
    public void SetSalary(int salary){
        this.salary=salary;}

    public void Taxes(){
        System.out.println("Выплачиваемые налоги: "+salary*0.18);
    }
}
