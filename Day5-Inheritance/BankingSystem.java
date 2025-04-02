class BankAccount{
    int accNum;
    int accBalance;
    public BankAccount(int accNum,int accBalance){
        this.accNum=accNum;
        this.accBalance=accBalance;
    }
    void displaydetails(){
        System.out.println("Account number: "+accNum);
        System.out.println("Account balance: "+accBalance);
    }
}
class SavingsAccount extends BankAccount{
    int intrestrate;
    public SavingsAccount(int intrestrate, int accNum, int accBalance) {
        super(accNum, accBalance);
        this.intrestrate = intrestrate;
    }
    @Override
    void displaydetails(){
        super.displaydetails();
        System.out.println("Intrest rate: "+intrestrate);
    }
}
class CheckingAccount extends BankAccount{
    int withdrawallimit;
    public CheckingAccount(int withdrawallimit, int accNum, int accBalance) {
        super(accNum, accBalance);
        this.withdrawallimit = withdrawallimit;
    }
    @Override
    void displaydetails(){
        super.displaydetails();
        System.out.println("With drawal limit: "+withdrawallimit);
    }
}
class FixedDepositAccount extends BankAccount{
    int depositedamount;
    public FixedDepositAccount(int depositedamount, int accNum, int accBalance) {
        super(accNum, accBalance);
        this.depositedamount = depositedamount;
    }
    @Override
    void displaydetails(){
        super.displaydetails();
        System.out.println("Fixed deposited amount: "+depositedamount);
    }
}
public class BankingSystem{
    public static void main(String[] args) {
        BankAccount b1=new SavingsAccount(5,147562,20000);
        BankAccount b2=new CheckingAccount(5000,147895,50000);
        BankAccount b3=new FixedDepositAccount(50000,1533280,1560000);
        System.out.println("--------Account 1------");
        b1.displaydetails();
        System.out.println("--------Account 2------");
        b2.displaydetails();
        System.out.println("--------Account 3------");
        b3.displaydetails();
    }
}