class Course{
    String courseName;
    int duration;
    public Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    void displaydetails(){
        System.out.println("Course name: "+courseName);
        System.out.println("Duration of course: "+duration);
    }
}
class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;
    public OnlineCourse(String platform, boolean isRecorded, String courseName, int duraion) {
        super(courseName, duraion);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    @Override
    void displaydetails(){
        super.displaydetails();
        System.out.println("Course Platform: "+platform);
        System.out.println("IS recorded: "+isRecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;
    public PaidOnlineCourse(String platform, boolean isRecorded, String courseName, int duraion,int fee,int discount){
        super(platform, isRecorded, courseName, duraion);
        this.fee=fee;
        this.discount=discount;
    }
    @Override
    void displaydetails(){
        super.displaydetails();
        System.out.println("Course fee: "+fee);
        System.out.println("Discount: "+discount);
        System.out.println("Total fee: "+ (fee-discount));
    }
}
public class EduCourse{
    public static void main(String[] args) {
        Course c1=new OnlineCourse("Coursera", true ,"Fun with Java",5);
        Course c2=new PaidOnlineCourse("Edureka",true,"Data science",3,500,200);
        System.out.println("------course 1-------");
        c1.displaydetails();
        System.out.println("------Course 2-------");
        c2.displaydetails();
    }
}