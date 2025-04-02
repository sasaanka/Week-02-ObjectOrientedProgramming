class Employee{
    String name;
    int id;
    int salary;
    public Employee(String name,int id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void displaydetails(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary: "+salary);
    }
}
class Manager extends Employee{
    int teamsize;
    Manager(String name,int id,int salary,int teamsize){
        super(name, id, salary);
        this.teamsize=teamsize;
    }
    @Override
    void displaydetails(){
        super.displaydetails();
        System.out.println("Team size of manager is "+teamsize);
    }
}
class Developer extends Employee{
    String ProgLanguage;
    public Developer(String ProgLanguage, String name, int id, int salary) {
        super(name, id, salary);
        this.ProgLanguage = ProgLanguage;
    }
    @Override
    void displaydetails(){
        super.displaydetails();
        System.out.println("Programming language is "+ProgLanguage);
    }
}
class Intern extends Employee{
    int stipend;
    public Intern(int stipend,String name,int id,int salary){
        super(name, id, salary);
        this.stipend=stipend;
    }
    @Override
    void displaydetails(){
        super.displaydetails();
        System.out.println("The stipend is "+stipend);
    }
}
public class Employeehie{
    public static void main(String[] args) {
        Employee e1=new Manager("Sasanka",10,80000,4);
        Employee e2=new Developer("Java","Abhinaya",30,50000);
        Employee e3=new Intern(40000,"Bharath",022,90000);
        System.out.println("------Manager-------");
        e1.displaydetails();
        System.out.println("------Developer------");
        e2.displaydetails();
        System.out.println("------Intern---------");
        e3.displaydetails();
    }
}