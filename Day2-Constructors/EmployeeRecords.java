class Employee{
    public int employeeID;
    protected String dept;
    private int salary;
    public Employee(int employeeID, String dept, int salary) {
        this.employeeID = employeeID;
        this.dept = dept;
        this.salary = salary;
    }
    public double getsalary(){
        return salary;
    }
    public void setsalary(int salary){
        if (salary>0){
            this.salary=salary;
        }else{
            System.out.println("Invalid");
        }
    }
    public void displaydetails(){
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Department: "+dept);
        System.out.println("Salary : "+getsalary());
    }
}
class Manager extends Employee{
    String teamName;
    public Manager(String teamName, int employeeID, String dept, int salary) {
        super(employeeID, dept, salary);
        this.teamName = teamName;
    }
    @Override
    public void displaydetails(){
        super.displaydetails();
        System.out.println("Team name: "+teamName);
    }
}
public class EmployeeRecords{
    public static void main(String[] args) {
        Employee e1=new Employee(10,"Finance",60000);
        e1.displaydetails();
        System.out.println("\nUpdating salary");
        e1.setsalary(90000);
        e1.displaydetails();
        Manager m1=new Manager("Development team",20,"IT",90000);
        System.out.println("");
        m1.displaydetails();
    }
}