public class BankAccount
{
    String name;
    String accountNumber;
    double balance;

    public BankAccount()
    {
        name="UNKNOWN";
        accountNumber="000000000";
        balance=0.0;
    }

    //public BankAccount(String nm, String accNum, double bal) {
      //  name = nm;
        //accountNumber = accNum;
       // balance = bal;
    public BankAccount(String name,String accountNumber,double balance)
    {
        this.name=name;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public String display() // methods
    {
        String details = "Name: " + name.toUpperCase() + " Account Number: " + accountNumber + " Balance: " + balance;
        return details;

    }
    public String withdraw(double withdrawal) {
        if (withdrawal <= balance) {
            balance = balance - withdrawal;
            return("withdrawal successful");
        }
        else return ("unable to withdraw " + withdrawal +" for "+ name + " due to unsufficient funds");

    }
    public void deposit(double lodgement) {
        balance = balance + lodgement; // same as balance+=logement
    }
}
