
public class Main1 {
  public static void main(String[] args) {
    Account paulsAccount = new Account(34983);
    AccountHolder Paul = new AccountHolder(paulsAccount, "Paul", "Kolb", 123456789);
    paulsAccount.deposit(23445);
    System.out.println("Your Account: ");
    System.out.println("Lastname: " + Paul.getlastName());
    System.out.println("Firstname: " + Paul.getfirstName());
    System.out.println("Your Bank Account Number is: " + paulsAccount.getaccountNumber() + "\n");
    System.out.println("Dates:");
    System.out.println("Account number: " + paulsAccount.getaccountNumber() + "; Bank code: " + paulsAccount.getbankCode());
    System.out.println("Your Balance: " + paulsAccount.getbalance());
  }

}
