class StudentReport{
    String name;
    int rollno;
    int marks;
    StudentReport(String name,int rollno,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    public static char grades(int marks){
        char ch;
        if (marks>90){
             ch='A';
        }else if(marks>80){
             ch='B';
        }else if (marks>70){
             ch='C';
        }else if(marks>60){
            ch='D';
        }else{
            ch='F';
        }
        return ch;
    }
    public void DisplayDetails(){
        System.out.println("The student name is "+name);
        System.out.println("The student rollno is "+rollno);
        System.out.println("The student marks is "+marks);
        System.out.println("The student grade is "+grades(marks));
    }
    public static void main(String[] args) {
        StudentReport stu1=new StudentReport("Sasanka",10,99);
        StudentReport stu2=new StudentReport("Abhinaya",30,84);
        StudentReport stu3=new StudentReport("Bharath",02,80);
        System.out.println("The Report of Student 1");
        stu1.DisplayDetails();
        System.out.println("\nThe Report of Student 2");
        stu2.DisplayDetails();
        System.out.println("\nThe Report of Student 3");
        stu3.DisplayDetails();
    }
}