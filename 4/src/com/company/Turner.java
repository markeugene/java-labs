package com.company;

 public class Turner extends Worker{
//тут все тоже самое
     Turner(String fio, boolean sex,String date, int exp,int salary)
     {
        super(fio,sex,date,exp,salary);
     }
     @Override
     public void GetFio() {
        System.out.println("FIO: "+this.fio);

     }
     @Override
     public void GetSex() {
         System.out.println("Sex: "+this.sex);
     }

     @Override
     public void GetDate() {
         System.out.println("Date: "+this.date);

     }

     @Override
     public void GetExp() {
         System.out.println("Experience: "+this.exp);
     }

     @Override
     public void GetSalary() {
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
     public void print(){
         System.out.println("FIO:"+this.fio+" Sex: "+this.sex+" Date: "+this.date+" Expirience: "+this.exp+" Salary: "+this.salary);
     }
     public void Taxes() {
         System.out.println("Taxes: "+this.salary*0.15);
     }
 }
