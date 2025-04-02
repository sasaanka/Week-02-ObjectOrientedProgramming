import java.util.*;

class Employee{
    final private String employeename;
    final private String position;

    public Employee(String employeename, String position) {
        this.employeename = employeename;
        this.position = position;
    }

    public void displayDetails(){
        System.out.println("Employee Name :"+employeename);
        System.out.println("Position "+position);
    }



}
class Department{
    final private String Departmentname;
    final private List<Employee> employeeList;

    public Department(String departmentname) {
        this.Departmentname=departmentname;
        this.employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void displaydetails(){
        System.out.println("Department Name "+Departmentname);
        for (Employee employee: employeeList){
            employee.displayDetails();
        }
    }

    public void clearEmployees() {
        employeeList.clear();
        System.out.println("All employees in " + Departmentname + " deleted.");
    }
}
class Company{
    final private String CompanyName;
    final private List<Department> departmentList;

    public Company(String CompanyName){
        this.CompanyName=CompanyName;
        this.departmentList=new ArrayList<>();
    }

    public void addDepartment(Department department){
        departmentList.add(department);
    }
    public void displayDetails(){
        System.out.println("Company name :"+CompanyName);
        for(Department department:departmentList){
            department.displaydetails();
        }
    }

    public void deleteCompany() {
        for (Department department : departmentList) {
            department.clearEmployees(); 
        }
        departmentList.clear(); 
        System.out.println("Company " + CompanyName + " and all its departments and employees have been deleted.");
    }

}
public class CompanyandDepartments {
    public static void main(String[] args) {
        Company company = new Company("Tech Solutions");

        Department devDepartment = new Department("Development");
        Department hrDepartment = new Department("Human Resources");

        devDepartment.addEmployee(new Employee("Alice", "Software Engineer"));
        devDepartment.addEmployee(new Employee("Bob", "Senior Developer"));
        hrDepartment.addEmployee(new Employee("Carol", "HR Manager"));
        hrDepartment.addEmployee(new Employee("Dave", "Recruiter"));

        company.addDepartment(devDepartment);
        company.addDepartment(hrDepartment);

        company.displayDetails();

        company.deleteCompany();
        

    

    }
}
