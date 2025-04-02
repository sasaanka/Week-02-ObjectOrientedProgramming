import java.util.ArrayList;
import java.util.List;

abstract class Patient {
    final private int patientId;
    final private String name;
    final private int age;
    final private List<String> medicalHistory = new ArrayList<>();

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public int getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }
    protected void addToHistory(String record) {
        medicalHistory.add(record);
    }

    protected List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory); 
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public abstract double calculateBill();
}
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}
class InPatient extends Patient implements MedicalRecord {
    final private int daysAdmitted;
    final private double dailyRate;

    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        addToHistory("InPatient Record: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : getMedicalHistory()) {
            System.out.println("- " + record);
        }
    }
}
class OutPatient extends Patient implements MedicalRecord {
    final private double consultationFee;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        addToHistory("OutPatient Record: " + record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History:");
        for (String record : getMedicalHistory()) {
            System.out.println("- " + record);
        }
    }
}

public class HospitalPatient {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient(101, "Alice", 45, 5, 2000.0);
        OutPatient p2 = new OutPatient(102, "Bob", 30, 500.0);

        p1.addRecord("Admitted for surgery");
        p2.addRecord("Routine check-up");

        patients.add(p1);
        patients.add(p2);

        for (Patient patient : patients) {
            System.out.println("--------");
            patient.getPatientDetails();
            System.out.println("Bill Amount: ₹" + patient.calculateBill());

            if (patient instanceof MedicalRecord recordHandler) {
                recordHandler.viewRecords();
            }
        }
    }
}
