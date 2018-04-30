
public class AccountHolder {

  static int counter = 0;
  Account account;
  private String firstName; // getter weil Name auslesbar sein soll; setter
  // möglich wenn Namensänderung erlaubt
  private String lastName; // getter weil Name auslesbar sein soll; setter
  // möglich wenn Namensänderung erlaubt
  private int accountHolderNumber; // getter weil nummer auslesbar, aber nicht
  // veränderbar
  
  /**
   * This constructor "AccountHolder" initializes the parameters "account", "firstName",
   * "lastName" and "accountHolderNumber" and equals "accountHolderNumber" and "counter" 
   * which adds one after each passage of the array "accountHolder".
   * @param account is parameter from the type Account
   * @param firstName is parameter from the type String
   * @param lastName is parameter from the type String
   * @param accountHolderNumber is parameter from the type int
   */
  
  public AccountHolder(Account account, String firstName, String lastName,
      int accountHolderNumber) {
    this.account = account;
    this.firstName = firstName;
    this.lastName = lastName;
    this.accountHolderNumber = accountHolderNumber;
    accountHolderNumber = counter;
    counter++;
  }
  
  //set and get methods
  
  public void setfirstName(String fristName) {
    this.firstName = firstName;
  }

  public String getfirstName() {
    return this.firstName;
  }

  public void setlastName(String lastName) {
    this.lastName = lastName;
  }

  public String getlastName() {
    return this.lastName;
  }

  public int getaccountHolderNumber() {
    return this.accountHolderNumber;
  }

}
