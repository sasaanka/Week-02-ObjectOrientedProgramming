class BankAccount{
    String accountHolder;
    int accountNumber;
    int balance;

    public BankAccount(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public  int depositMoney(int money){
         balance=balance+money;
         return balance;
    }
    public int withdrawMoney(int money){
        if (money<balance){
            balance-=money;
        }else{
            System.out.println("No funds");
        }
        return balance;
    }
    public void DisplayDetails(){
        System.out.println("The account holder is "+accountHolder);
        System.out.println("The account number is "+accountNumber);
        System.out.println("The money deposited is "+depositMoney(500));
        System.out.println("The money after withdrwal is "+withdrawMoney(1000));
        System.out.println("The balance is "+balance);
    }
    public static void main(String[] args) {
        BankAccount holder1=new BankAccount("Sasanka", 2325,20000);
        BankAccount holder2=new BankAccount("Bharath", 2324,22000);
        System.out.println("The account holder 1 ");
        holder1.DisplayDetails();
         System.out.println("\nThe account holder 2 ");
        holder2.DisplayDetails();
    }
}