package edu.kit.informatik;

public class Account {

  //Attributes
  /*get-method required to get the accountNumber, accountNumber should not be able
    to be changes => no set-method
    */
  private int accountNumber;
  
  /*get-method required to get the accountNumber, accountNumber should not be able
    to be changes => no set-method
    */
  private int bankCode;
  
  /*get-method required to get the accountNumber, accountNumber should not be able
    to be changes => no set-method
    */
  private int balance;
  
  /**
   * This constructor initializes the accountNumber and the bankCode.
   * @param accountNumber is initializes
   * @param bankCode is given in this constructor to be used later
   */
  public Account(int accountNumber, int bankCode) {
    this.accountNumber = accountNumber;
    this.bankCode = bankCode;
  }

  public int getBalance() {
    return this.balance;
  }

  public int getBankCode() {
    return this.bankCode;
  }
  
  /**
   * This method test whether the "balance" of the account 
   * of the user is greater or equal with the "amount". 
   * If that is the case it is okay to withdraw the amount otherwise not. 
   * @param amount this is one of the parameters
   * @return the primitive boolean value of this object.
   */
  public boolean withdraw(int amount) {
    if (balance >= amount) {
      this.balance -= amount;
      return true;
    }
    return false;
  }
  
  /**
   * This method deposit a certain amount to your account.
   * @param amount is a parameter of the method
   */
  public void deposit(int amount) {
    this.balance += amount;
  }

  /**
   * This method is the get-method for the accountNumber.
   * @return accountNumber is the number that gets returned
   */
  public int getAccountNumber() {
    return this.accountNumber;

  }

}