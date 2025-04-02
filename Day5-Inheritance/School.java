class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayRole(){
        System.out.println("Name of the person: "+name);
        System.out.println("Age of the person: "+age);
    }
}
class Teacher extends Person{
    String Subject;

    public Teacher(String Subject, String name, int age) {
        super(name, age);
        this.Subject = Subject;
    }
    @Override
    void displayRole(){
        super.displayRole();
        System.out.println("I am a teacher and I teach: "+Subject);
    }
}
class Student extends Person{
    char grade;

    public Student(char grade, String name, int age) {
        super(name, age);
        this.grade = grade;
    }
    @Override
    void displayRole(){
        super.displayRole();
        System.out.println("I am a Student and my grade is "+grade);
    }
}
class Staff extends Person{
    public Staff(String name,int age){
        super(name,age);
    }
    @Override
    void displayRole(){
        super.displayRole();
        System.out.println("I am the staff");
    }
}
public class School{
    public static void main(String[] args) {
        Person p1=new Teacher("Social","Sasanka",24);
        Person p2=new Student('O',"Bharath",21);
        Person p3=new Staff("akshaya",30);
        System.out.println("-----Person 1-----");
        p1.displayRole();
        System.out.println("-----Person 2-----");
        p2.displayRole();
        System.out.println("-----Person 3-----");
        p3.displayRole();
    }
}