public static void main(String[] args) {
    BankAccount bankAccount1 = new BankAccount("ElonMuskLong", "123456789", -1.0);

    System.out.println("The balance of the bank account is : "+ bankAccount1.getBalance()+ " Owner:" + bankAccount1.getName());
    // this  prints out the details to the console
    bankAccount1.setName("VitaljushkuLubljuYa");
    System.out.println(bankAccount1.display());
}


