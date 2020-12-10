import com.company.Employee;
import com.company.Object;

public class Chief implements Employee, Object {
    public String fio = null;
    public boolean sex = false;
    public String date = null;
    public int exp = 0;
    public  int salary = 0;
    private String name_c=null;
    private int amountof=0;

    Chief(String fio,boolean sex, String date, int exp, int salary,String name_c,int amountof){//конструктор
        this.fio=fio;
        this.sex=sex;
        this.date=date;
        this.exp=exp;
        this.salary=salary;
        this.name_c=name_c;
        this.amountof=amountof;
    }


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
    public void GetNamec(){
        System.out.println("Name: "+this.name_c);
    }
    public void GetAmountof(){
        System.out.println("Amount of: "+this.amountof);
    }
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
    public void SetNamec(String name_c){
        this.name_c=name_c;
    }
    public void SetAmount(int amountof){
        this.amountof=amountof;
    }

    public void print() {
        System.out.println("FIO:"+this.fio+" Sex: "+this.sex+" Date: "+this.date+" Expirience: "+this.exp+" Salary: "+this.salary+"Name: "+this.name_c+"Amount :"+this.amountof);
    }
    @Override
    public void Taxes() {
        System.out.println("Выплачиваемые налоги: "+this.salary*0.2);
    }
}
