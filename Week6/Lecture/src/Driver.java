public class Driver {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
       // System.out.println(ba1.name);
        ba1.name="Alisa Poly";
       // System.out.println(ba1.name);

        BankAccount ba2 = new BankAccount("elon Mask", "12345678", 890.99);
       // System.out.println(ba2.name);
      //  System.out.println(ba1.display());
       // System.out.println(ba2.display());
      //  ba1.deposit(100);
      //  System.out.println(ba1.withdraw(90));
      // System.out.println(ba1.withdraw(900));

       BankAccount [] bank = new BankAccount[2];
       bank[0]=new BankAccount("Donald Duck", "987654321", 18272353);
       bank[1]=new BankAccount("Skrudge", "65938276", 2300);
               for (int i=0; i<bank.length;i++)
               System.out.println(bank[i].display());

    }
}
