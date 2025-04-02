 class EmployeeDetails{
    String name;
    int id;
    int salary;

    //constructor
    public EmployeeDetails(String name,int id,int salary) {
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void DisplayDetails(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee salary:" +salary);
    }    
}
public class Employeedetails{
    public static void main(String[] args) {
        EmployeeDetails Employee1=new EmployeeDetails("Sasanka", 10,100000);
        EmployeeDetails Employee2=new EmployeeDetails("Abhinaya",30,80000);
        EmployeeDetails Employee3=new EmployeeDetails("Bharath",02,900000);
        System.out.println("\n---Employee 1 details----");
        Employee1.DisplayDetails();
        System.out.println("\n---Employee 2 details----");
        Employee2.DisplayDetails();
        System.out.println("\n---Employee 3 details----");
        Employee3.DisplayDetails();
    }
}