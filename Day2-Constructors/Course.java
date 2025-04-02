class Course{
    String courseName;
    int duration,fee;
    static String institueName="VIT";
    Course(String courseName,int duration,int fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
    }
    static void modifyname(String newname){
        institueName=newname;
    }
    public void displaydetails(){
        System.out.println("The course name is "+ courseName+" and the duration is "+duration);
        System.out.println("The fee for the course "+courseName+" is "+fee+" in institue "+institueName);
    }
    public static void main(String[] args) {
        Course c1=new Course("AIML", 4, 200000);
        Course c2=new Course("Java",2,2000);
        System.out.println("-----Person 1------");
        c1.displaydetails();
        Course.modifyname("SRM");
        System.out.println("-----Person 2------");
        c2.displaydetails();
    }
}