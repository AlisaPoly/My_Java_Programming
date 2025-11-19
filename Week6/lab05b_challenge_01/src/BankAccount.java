class BankAccount {

    private String name;
    private String accountNumber;
    private double balance;

    //------------------//
    //   constructors   //
    //------------------//

    public BankAccount() {
    }

    public BankAccount(String name, String accountNumber, double balance){
        if (name.length()>10){
            this.name = name.substring(0, 10);
        }
        else
            this.name = name;
        this.accountNumber = accountNumber;
        if (balance >=0 && balance <= 1000 ) {
            this.balance = balance;
        }
        else
            this.balance = 50;
    }
    //------------------//
    //     methods      //
    //------------------//

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

    //------------------//
    //     getters      //
    //------------------//

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //------------------//
    //     setters      //
    //------------------//

    public void setName(String name) {
        if (name.length()>10){
            this.name = name.substring(0, 10);
        }
        else
            this.name = name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
