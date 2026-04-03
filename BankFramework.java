interface Bank{
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}

class Customer{
    private String name;
    private int cId;

    public Customer(String name,int cId){
        this.name= name;
        this.cId= cId;
    }

    public void displayCustomer(){
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + cId);
    }
}

class Account implements Bank{
    private double balance;
    private Customer customer;

    public Account(Customer customer,double balance){
        this.customer = customer;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!!!!!!!!!!!!!!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void showAccountDetails() {
        customer.displayCustomer();
        displayBalance();
    }
}

public class BankFramework{
    public static void main(String[] args) {
        Customer c1 = new Customer("Abhinab Baruah", 101);
        Account acc = new Account(c1, 5000);

        acc.showAccountDetails();
        acc.deposit(2000);
        acc.withdraw(500);
        acc.displayBalance();
    }
}
