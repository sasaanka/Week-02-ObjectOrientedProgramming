import java.util.ArrayList;
import java.util.List;
abstract class Employee {
    final private int employeeID;
    final private String name;
    private int baseSalary;
    public Employee(int employeeID, String name, int baseSalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public int getEmployeeId() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    abstract int calculateSalary();
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}
interface Department {
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
}
class FulltimeEmployee extends Employee implements Department {
    private String department;

    public FulltimeEmployee(int employeeID, String name, int baseSalary) {
        super(employeeID, name, baseSalary);
    }
    @Override
    public int calculateSalary() {
        return getBaseSalary();
    }
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }
    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
class ParttimeEmployee extends Employee implements Department {
    final private int hoursWorked;
    final private int hourlyRate;
    private String department;

    public ParttimeEmployee(int employeeID, String name, int hoursWorked, int hourlyRate) {
        super(employeeID, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public int calculateSalary() {
        return hoursWorked * hourlyRate;
    }
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }
    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}
public class Employeemansys {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        FulltimeEmployee emp1 = new FulltimeEmployee(101, "Alice", 50000);
        ParttimeEmployee emp2 = new ParttimeEmployee(102, "Bob", 200, 25);
        emp1.assignDepartment("IT");
        emp2.assignDepartment("HR");
        employees.add(emp1);
        employees.add(emp2);
        for (Employee emp : employees) {
            emp.displayDetails();
            if (emp instanceof Department department) {
                System.out.println(department.getDepartmentDetails());
            }
            System.out.println("-----------------------------");
        }
    }
}
