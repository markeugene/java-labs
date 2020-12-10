package com.company;

public abstract class Worker implements Employee, Object {
    public String fio = null;
    public boolean sex = false;
    public String date = null;
    public int exp = 0;
    public  int salary = 0;

    Worker(String fio, boolean sex, String date, int exp, int salary) {
        this.fio=fio;
        this.sex=sex;
        this.date=date;
        this.exp=exp;
        this.salary=salary;

    };
    //определение методов которые будут наследоваться
    public abstract void print();
    abstract void GetFio();
    abstract void GetSex();
    abstract void GetDate();
    abstract void GetExp();
    abstract void GetSalary();

}
