class Student{
    public int rollno;
    protected String name;
    private double CGPA;

    public Student(int rollno,String name,double CGPA) {
        this.rollno=rollno;
        this.name=name;
        this.CGPA=CGPA;
    }
    public double getCGPA(){
        return CGPA;
    }
    public void setCGPA(double CGPA){
        if (CGPA>=0 && CGPA<=10){
            this.CGPA=CGPA;
        }else{
            System.out.println("Invalid CGPA");
        }
    }
    public void displaydetails(){
        System.out.println("Roll number: "+rollno);
        System.out.println("Name: "+name);
        System.out.println("CGPA:"+getCGPA());
    }
}
class PostgraduateStudent extends Student{
     String specialize;
    public PostgraduateStudent(int rollno,String name,double CGPA,String specialize){
        super(rollno, name, CGPA);
        this.specialize=specialize;
    }
    @Override
    public void displaydetails(){
        super.displaydetails();
        System.out.println("Specialization : "+specialize);
    }
}
public class Main{
    public static void main(String[] args) {
        Student stu1=new Student(101,"Sasanka",9.6);
        stu1.displaydetails();
        stu1.setCGPA(9.8);
        System.out.println("Updated CGPA: "+stu1.getCGPA());
        System.out.println("");
        PostgraduateStudent p1=new PostgraduateStudent(10, "NANDa", 7.8, "AIML");
        p1.displaydetails();
    }

}