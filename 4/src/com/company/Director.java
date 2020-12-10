package com.company;

public class Director implements Object,Employee {

    public String fio = null;
    public boolean sex = false;
    public String date = null;
    public int exp = 0;
    public  int salary = 0;
    public String dateof=null;

    Director(String fio,boolean sex, String date, int exp,int salary, String  dateof)//конструктор
    {
        this.fio=fio;
        this.sex=sex;
        this.date=date;
        this.exp=exp;
        this.salary=salary;
        this.dateof=dateof;
    }
    // сеттеры + геттеры
    public void GetFio() {
        System.out.println("FIO: "+this.fio);

    }
    public void GetSex() {
        System.out.println("Sex: "+this.sex);
    }
    public void GetDate() {
        System.out.println("Date: "+this.date);

    }
    public void GetExp() {
        System.out.println("Experience: "+this.exp);
    }
    public void GetSalary() {
        System.out.println("Salary: "+this.exp);

    }
    public void GetDateof(){
        System.out.println("Date of chose: "+this.dateof);
    }


    public void SetFio(String fio){
        this.fio=fio;
    }
    public void SetSex(boolean sex){
        this.sex=sex;
    }
    public void SetDate(String date){
        this.date=date;
    }
    public void SetExp(int exp){
        this.exp=exp;
    }
    public void SetSalary(int salary){
        this.salary=salary;
    }
    public void SetDateof(String dateof){
        this.dateof=dateof;
    }




// методы налогов+ вывода
    public void Taxes(){
    System.out.println("Выплачиваемые налоги: "+this.salary*0.15);
    }
    public void print(){
        System.out.println("FIO:"+this.fio+" Sex: "+this.sex+" Date: "+this.date+" Expirience: "+this.exp+" Salary: "+this.salary+"Date of chose: "+this.dateof);
    }
}
