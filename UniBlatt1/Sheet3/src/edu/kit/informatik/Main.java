package edu.kit.informatik;

public class Main {

  /**
   * This method just has just been created to check the results.
   * @param args is a given parameter of the main-method
   */
  public static void main(String[] args) {
    Bank newBank = new Bank(123456789);
    newBank.createAccount(45);
    newBank.createAccount(9);
    newBank.createAccount(342267);
    newBank.createAccount(7);
    newBank.createAccount(3);
    newBank.createAccount(343);
    newBank.createAccount(7);
    newBank.createAccount(789);
    newBank.createAccount(5645);
    //newBank.removeAccount(7);
    //System.out.println("New account: " + newBank.createAccount(44));
    //System.out.println("2. account " + newBank.createAccount(6));
    newBank.printAllAccounts();
  }

}
