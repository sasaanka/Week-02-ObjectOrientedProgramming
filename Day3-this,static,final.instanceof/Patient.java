class Patient{
    static String hospitalName="SRM hospital";
    static int totalpatients=0;
    String name;
    int age;
    String aliment;
    final int patientID;
    Patient(String name,int age,String aliment,int patientID){
        this.name=name;
        this.age=age;
        this.aliment=aliment;
        this.patientID=patientID;
        totalpatients++;
    }
    public static void gettotalpatients(){
        System.out.println("Total patients: "+totalpatients);
    }
    void displaydetails(){
        System.out.println("Hospital name: "+hospitalName);
        System.out.println("Patient name: "+name);
        System.out.println("Pateints age: "+age);
        System.out.println("Aliment: "+aliment);
        System.out.println("Patient ID: "+patientID);
    }
    public static void main(String[] args) {
        Patient p1=new Patient("Sasanka",20,"BP",1298);
        Patient p2=new Patient("Bharath",21,"High BP",1234);
        System.out.println("------Patient 1 --------");
        p1.displaydetails();
        if (p1 instanceof Patient){
            System.out.println("Object p1 is instance of patient");
        }else{
            System.out.println("Object p1 is not instance of Patient");
        }
        System.out.println("------Patient 2-------");
        if (p2 instanceof Patient){
            System.out.println("Object p2 is instance of patient");
        }else{
            System.out.println("Object p2 is not instance of Patient");
        }
        p2.displaydetails();
        Patient.gettotalpatients();
    }
}