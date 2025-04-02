class BankAccount{
    String accountHolderName;
    final int accountNumber;
    static String bankName="BOB";
    static int totalaccount=0;
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalaccount++;
    }
    public static void gettotalaccount(){
        System.out.println("Total accounts are "+totalaccount);
    }
    public void displaydetails(){
        System.out.println("Account Holder name: "+accountHolderName);
        System.out.println("Account number : "+accountNumber);
        System.out.println("Bank name: "+bankName);
    }
    public static void main(String[] args) {
        BankAccount account1=new BankAccount("Sasanka",818345);
        BankAccount account2=new BankAccount("Abhinaya",677213);
        if (account1 instanceof BankAccount){
            System.out.println("Account 1 is instance of Bank account");
            account1.displaydetails();
        }else{
            System.out.println("Account 1 is not instance of Bank account");
        }
        System.out.println("Details of another account");
        account2.displaydetails();
        BankAccount.gettotalaccount();
    }
}