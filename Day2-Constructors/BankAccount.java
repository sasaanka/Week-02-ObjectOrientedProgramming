class Bankdetails{
    public long accountNumber;
    protected String accountHolder;
    private int balance;

    public Bankdetails(long accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public int getbalance(){
        return balance;
    }
    public void setbalance(int balance){
        this.balance=balance;
    }
    public void displaydetails(){
        System.out.println("Account number : "+accountNumber);
        System.out.println("Account holder : "+accountHolder);
        System.out.println("Available balance: "+balance);
    }
}
class SavingsAccount extends Bankdetails{
    double intrestrate;
    public SavingsAccount(long accountNumber,String accountHolder,int balance,double intrestrate){
        super(accountNumber, accountHolder, balance);
        this.intrestrate=intrestrate;
    }
    @Override
    public void displaydetails(){
        super.displaydetails();
        System.out.println("Intrestrate: "+intrestrate);
    }
}
public class BankAccount{
    public static void main(String[] args) {
        Bankdetails acc1=new Bankdetails(8183456, "sasanka",20000);
        acc1.displaydetails();
        System.out.println("\nUpdating balance");
        acc1.setbalance(50000);
        acc1.displaydetails();
        SavingsAccount s1=new SavingsAccount(78451236,"Bharath", 20000, 2.5);
        System.out.println("");
        s1.displaydetails();
    }
}