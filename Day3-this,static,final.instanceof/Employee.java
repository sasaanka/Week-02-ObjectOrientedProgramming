class Employee{
    static String companyName="Capgemini";
    final int id;
    String name;
    String designation;
    static int totalemployees=0;
    Employee(int id,String name,String designation){
        this.id=id;
        this.name=name;
        this.designation=designation;
        totalemployees++;
    }
    static void gettotalemployee(){
        System.out.println("Total no of employees are "+totalemployees);
    }
    void displaydetails(){
        System.out.println("Employee id: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Designation of the employee: "+designation);
        System.out.println("Company name: "+companyName);
    }
    public static void main(String[] args) {
        Employee e1=new Employee(120,"sasanka","Manager");
        Employee e2=new Employee(123,"abhinaya","Employee");
        e1.displaydetails();
        e2.displaydetails();
        Employee.gettotalemployee();
    }
}