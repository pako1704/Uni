
public class Account {

  // attributes
  static int counter = 0;
  /*
   * get-method to be able to read the accountNumber user needs to know his
   * accountNumber set-method is not used because we do not want the user to
   * be able to change the number
   */
  private int accountNumber;
  /*
   * get-method for bankCode needs to be known by the user set-method is not
   * necessary because the user is not allowed to change the bankCode
   */
  private int bankCode;
  /*
   * get-method is important for the user to see his balance 
   * set-method is not used because the user is not allowed 
   * to change his balance
   */
  private int balance = 0;

  // Standard constructor
  /**
   * This constructor equals "accountNumber" and "counter" 
   * which adds one after each passage of the array "account". 
   * The new "accountNumber" is the old counter plus one.
   * @param bankCode is variable which 
   */
  public Account(int bankCode) {
    this.bankCode = bankCode;
    accountNumber = counter;
    counter++;
  }
  
  public int getcounter() {
    return Account.counter;
  }
  
  public int getaccountNumber() {
    return this.accountNumber;
  }
  
  public int getbankCode() {
    return this.bankCode;
  }
  
  public int getbalance() {
    return this.balance;
  }




  /**
   * This method test whether the "balance" of the account 
   * of the user is greater or equal with the "amount". 
   * If that is the case it is okay to withdraw the amount otherwise not. 
   * 
   * @param amount this is one of the parameters
   * @return the primitive boolean value of this object.
   */

  public boolean withdraw(int amount) {
    if (balance >= amount) {
      this.balance -= amount;
      return true;
    } else {
      return false;

    }
  }

  /**
   * This method deposit a certain amount to your account.
   * 
   * @param amount is a parameter of the method
   */

  public void deposit(int amount) {
    this.balance += amount;
  }

  /**
   * This method gives an amount of money from one bank account to another one 
   * and subtract the amount from the first account and add it to the second one.
   * @param account and amount are parameters of the method transfer
   */

  public void transfer(Account account, int amount) {
    this.balance -= amount;
    account.balance += amount;
  }

}
