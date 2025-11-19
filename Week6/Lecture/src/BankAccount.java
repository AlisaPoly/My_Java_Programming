public class BankAccount
{
    private String name;
    private String accountNumber;
    private double balance;
    private double limit;

    public BankAccount(String name,String accountNumber,double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else
            this.balance = 0;
        limit = 0;
    }
    public BankAccount(String name,String accountNumber,double balance,double limit) {
        this.name = name;
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else
            this.balance = 0;
        this.limit = limit;
    }
    public double getLimit() {
        return limit;
    }
    public void setLimit(double limit) {
        this.limit = limit;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }

    }
    public String display() // methods
    {
        String details = "Name: " + name.toUpperCase() + " Account Number: " + accountNumber + " Balance: " + balance;
        return details;

    }
    public String withdraw(double withdrawal) {
        if (withdrawal <= balance+limit) {
            balance = balance - withdrawal;
            return("withdrawal successful");
        }
        else return ("unable to withdraw " + withdrawal +" for "+ name + " due to unsufficient funds");

    }
    public void deposit(double lodgement) {

        balance = balance + lodgement; // same as balance+=lodgement
    }
    public void deposit(double lodgement, double fee) {

        balance = balance + lodgement - fee;
    }
}
