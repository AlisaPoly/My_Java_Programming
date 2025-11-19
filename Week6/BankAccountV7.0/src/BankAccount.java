public class BankAccount {
    private String name;
    private String accountNumber;
    private double balance;

    public BankAccount() {
    }
    public BankAccount(String name, String accountNumber, double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void deposit(double lodgement){
        balance += lodgement;
    }

    public String withdraw(double withdrawal){
        if (withdrawal <= balance) {
            balance -= withdrawal;
            return("Withdrawal successful");
        }
        else  return ("Unable to withdraw €" + withdrawal+ " for " + name + " due to insufficient funds.");
    }

    public String display(){
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: €" + balance;
    }
}
