public class BankAccount {
    String name;
    String accountNumber;
    double balance;

    public BankAccount() {
    }
    public BankAccount(String nm, String actNumber, double bal){
        name = nm;
        accountNumber = actNumber;
        balance = bal;
    }
    public String display(){
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: €" + balance;
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
}
