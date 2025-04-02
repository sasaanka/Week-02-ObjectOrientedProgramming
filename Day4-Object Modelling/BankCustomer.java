import java.util.*;

class Customer {
    final private String customerName;
    final private int bankAccountNo;
    final private double balance;

    public Customer(String customerName, int bankAccountNo, double balance) {
        this.customerName = customerName;
        this.bankAccountNo = bankAccountNo;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void viewBalance() {
        System.out.println("Balance is: " + getBalance());
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bank Account No: " + bankAccountNo);
        System.out.println("Balance: " + balance);
    }
}

class Bank {
    private static final String BANK_NAME = "ABC Bank";

    public static String getBankName() {
        return BANK_NAME;
    }
    final private List<Customer> customerList;

    public Bank() {
        this.customerList = new ArrayList<>();
    }

    public void openAccount(Customer customer) {
        customerList.add(customer);
    }

    public void displayDetails() {
        for (Customer customer : customerList) {
            System.out.println("Bank Name: " + BANK_NAME);
            customer.displayDetails();
            System.out.println();
        }
    }
}

public class BankCustomer {
    public static void main(String[] args) {

        Bank bank1 = new Bank();

        Customer customer1 = new Customer("Alice", 101, 5000.0);
        Customer customer2 = new Customer("Bob", 102, 10000.0);

        bank1.openAccount(customer1);
        bank1.openAccount(customer2);

        bank1.displayDetails();

        customer1.viewBalance();
        customer2.viewBalance();
    }
}
