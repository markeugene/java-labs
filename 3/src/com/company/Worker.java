package com.company;

public class Worker extends Employee {
    private int number;
    private int discharge;

    Worker(String fio,boolean sex, String date, int exp, int salary,int number,int discharge){//конструктор
        super(fio,sex,date,exp,salary);//вызов конструктора суперкласса
        this.number=number;
        this.discharge=discharge;
    }

    public void GetFio() {//вывод полей по запросу
        super.GetFio();
    }

    public void GetDate() {
        super.GetDate();
    }
    public void GetSalary() {
        super.GetSalary();
    }

    public int getDischarge() {
        return discharge;
    }

    public int getNumber() {
        return number;
    }

    public void GetExp() {
        super.GetExp();
    }

    public void GetSex() {
        super.GetSex();
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
        System.out.println("Выплачиваемые налоги: "+salary*0.17);
    }
}