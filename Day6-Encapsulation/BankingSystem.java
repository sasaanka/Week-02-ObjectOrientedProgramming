abstract class BankAccount{
    int accountNumber;
    String holderName;
    int balance;
    public BankAccount(int accountNumber,String holderName,int balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public int getAccountnum(){
        return accountNumber;
    }
    public String getHolderName(){
        return holderName;
    }
    public int getbalance(){
        return balance;
    }
    public double deposit(double amount){
        if (amount>0){
            balance+=amount;
        }else{
            System.out.println("Enter valid amount");
        }
        return 0;
    }
    public double withdraw(double amount){
        if (amount>0){
            balance-=amount;
        }else{
            System.out.println("Enter valid amount");
        }
        return 0;
    }
    @SuppressWarnings("unused")
    abstract  int calculateIntrest();
    public void displayDetails(){
        System.out.println("Account number: "+getAccountnum());
        System.out.println("Account holder name: "+getHolderName());
        System.out.println("Balance: "+getbalance());
    }
}
interface Loanable{
    void applyforloan(double amount);
    boolean loanEligible();
}
class SavingsAccount extends BankAccount implements Loanable{
    public SavingsAccount(int accountNumber,String holderName,int balance){
        super(accountNumber, holderName, balance);
    }
    @Override
    public int calculateIntrest(){
        return (int)(balance*0.04);
    }
    @Override
    public void applyforloan(double amount){
        System.out.println("Loan application submitted for "+holderName+" for "+amount);
    }
    @Override
    public boolean loanEligible(){
        return balance>=5000;
    }
}
class CurrentAccount extends BankAccount implements Loanable{
    public CurrentAccount(int accountNumber,String holderName,int balance){
        super(accountNumber, holderName, balance);
    }
    @Override
    public int calculateIntrest(){
        return 0;
    }
    @Override
    public void applyforloan(double amount){
        System.out.println("Loan application submitted for "+holderName+" for "+amount);
    }
    @Override
    public boolean loanEligible(){
        return balance>=10000;
    }
}
public class BankingSystem{
    public static void main(String[] args) {
        SavingsAccount a1=new SavingsAccount(152436,"sasanka",12000);
        CurrentAccount a2=new CurrentAccount(148562,"bharath",20);
        System.out.println("------person 1------");
        a1.displayDetails();
        System.out.println("The intrest: "+a1.calculateIntrest());
        a1.applyforloan(100000);
        a1.loanEligible();
        System.out.println("---------person 2------");
        a2.displayDetails();
        System.out.println("The intrest: "+a2.calculateIntrest());
        a2.applyforloan(100000);
        a2.loanEligible();
    }
}
