package com.company;

public class Locksmith extends  Worker {

    Locksmith(String fio,boolean sex, String date,int exp, int salary){
        super(fio,sex,date,exp,salary);//констурктор
    }

//геттеры сетеры
    @Override
    void GetFio() {
        System.out.println("FIO: "+this.fio);
    }

    @Override
    void GetSex() {
        System.out.println("Sex: "+this.sex);
    }

    @Override
    void GetDate() {
        System.out.println("Date: "+this.date);
    }

    @Override
    void GetExp() {
        System.out.println("Experience: "+this.exp);
    }

    @Override
    void GetSalary() {
        System.out.println("Salary: "+this.exp);
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
    //методы
    public void print(){
        System.out.println("FIO:"+this.fio+" Sex: "+this.sex+" Date: "+this.date+" Expirience: "+this.exp+" Salary: "+this.salary);
    }
    public void Taxes() {
        System.out.println("Taxes: "+this.salary*0.1);
    }

}
