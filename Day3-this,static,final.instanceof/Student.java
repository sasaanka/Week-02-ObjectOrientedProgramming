class Student{
    static String uniName="SRM";
    static int totalStudents=0;
    String name;
    final int rollno;
    char grade;
    Student(String name,int rollno,char grade){
        this.name=name;
        this.rollno=rollno;
        this.grade=grade;
        totalStudents++;
    }
    public static void displaytotalStudents(){
        System.out.println("Total no of students are "+totalStudents);
    }
    public void updateGrade(char newgrade){
        if(this instanceof Student){
            this.grade=newgrade;
            System.out.println("Updated grade for " + name + " (Roll No: " + rollno + ") to: " + grade);
        }
        else{
            System.out.println("Not an object");
        }
    }
    public void displaydetails(){
        System.out.println("NAme: "+name);
        System.out.println("Roll number: "+rollno);
        System.out.println("Grade: "+grade);
        System.out.println("University name: "+uniName);
    }
    public static void main(String[] args) {
        Student s1=new Student("sasanka", 20,'A');
        Student s2=new Student("Abhinaya", 10,'A');
        s1.updateGrade('O');
        s1.displaydetails();
        s2.displaydetails();
        Student.displaytotalStudents();
    }
}