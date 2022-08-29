import java.util.ArrayList;

//Here, I will modify the previously described Account class, add a new data field _name_ of the _String_
//type to store the name of the customer, add a new constructor that constructs an account with the
//specified name, id, and balance, add a new data field named _transactions_ whose type
//is _ArrayList_ that stores the transactions for the accounts. Each transaction is an instance of the
//_Transaction_ class. Modify the _withdraw_ and _deposit_ methods to add a transaction to the _transactions_
//array list.
class Account {
    private int id; //account number or ID
    private double balance; //Current balance
    private static double annualInterestRate; //might be savings or checking
    private java.util.Date dateCreated; //date account was created
    private String name;

    java.util.ArrayList transactions = new java.util.ArrayList();


    public Account() {
        dateCreated = new java.util.Date(); //changes date to today's date which means all the above will be '0'
    }

    public Account(int newId, double newBalance) {
        id = newId;
        balance = newBalance;
        dateCreated = new java.util.Date();
    }

    public Account(int newId, double newBalance, String name) {
        id = newId;
        balance = newBalance;
        this.name = name;
        dateCreated = new java.util.Date();
    }

    //below are our 'getters' for said information
    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    //below are setters to update anything if needed
    public void setId(int newId) {
        id = newId;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    } //set rates below

    public static void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, ""));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, ""));
    }

    public static void main(String[] args) {
        Account acc = new Account(12, 100, "Micheal");
        acc.deposit(30);
        acc.deposit(60);
        acc.deposit(100);

        acc.withdraw(10);
        acc.withdraw(30);
        acc.withdraw(20);

        System.out.println("Name: " + acc.getName());
        System.out.println("Annual Interest Rate: " + acc.getAnnualInterestRate());
        System.out.println("Balance: " + acc.getBalance());

        System.out.printf("%-35s%-15s%-15s%-15s\n", "Date", "Type", "Amount", "Balance");

        java.util.ArrayList list = acc.getTransactions();

        for (int i = 0; i < list.size(); i++) {
            Transaction t = (Transaction) list.get(i);
            System.out.printf("%-35s%-15s%-15s%-15s\n", t.getDate(),
                    t.getType(), t.getAmount(), t.getBalance());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList transactions) {
        this.transactions = transactions;
    }
}

//here i modified the account class to keep records of every transaction that occurs