import java.util.Date;

public class Transaction {

    private java.util.Date date;
    private char type;
    private double amount;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(char type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private String description;

    public Transaction (char type, double amount, double balance, String desc)
    {
        date = new java.util.Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = desc;
    }

}



//quick hack! to implement getters and setters, right click over your code, click generate, getter and setter
//then click where you want them to go!