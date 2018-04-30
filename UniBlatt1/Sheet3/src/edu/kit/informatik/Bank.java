package edu.kit.informatik;

public class Bank {
  private int bankCode;
  public Account[] accounts = new Account[8];

  public Bank(int bankCode) {
    this.bankCode = bankCode;
  }
  
  /**
   * This method was just build to check if the the programm works.
   * @author Paul Kolb
   */
  public void printAllAccounts() {
    System.out.println("Länge: " + accounts.length + " Bankleitzahl: " + bankCode);
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) {
        System.out.println(i + ": empty");
        continue;
      }
      System.out.println(i + ": " + accounts[i].getAccountNumber() + " | "
          + accounts[i].getBalance() + "€");
    }
  }
  
  /**
   * This method represents putting on an account
   * with the account number within the bank.  
   * @param accountNumber is initialized in this method
   * @return index gets returned 
   */
  public int createAccount(int accountNumber) {
    /*
     * int isInUse = getIndexOfAccountNumber(accountNumber);
     * if(isInUse!=-1){ accounts[isInUse] = new Account(accountNumber,
     * bankCode); return isInUse; }
     */
    int index = makeAccount(accountNumber);
    if (index != -1) {
      return index;
    }
    resizeAccounts(1);
    return makeAccount(accountNumber);
  }

  private int makeAccount(int accountNumber) {
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] == null) {
        accounts[i] = new Account(accountNumber, bankCode);
        return i;
      }
    }
    return -1;
  }

  private int getIndexOfAccountNumber(int accountNumber) {
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] != null && accounts[i].getAccountNumber() == accountNumber) {
        return i;
      }
    }
    return -1;
  }
  
  /**
   * This method represents the deleting of an account
   * within this bank.
   * @param accountNumber is used in this method
   * @return true or false if there is an account that has to be deleted or not
   */
  public boolean removeAccount(int accountNumber) {
    int index = getIndexOfAccountNumber(accountNumber);
    if (index != -1) {
      accounts[index] = null;
      resizeAccounts(0);
      return true;
    }
    return false;
  }

  private void resizeAccounts(int additionalSlots) {
    int slotsInUse = additionalSlots;
    int newArraySize = 8;
    Account[] accountsCache = new Account[accounts.length];
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] != null) {
        slotsInUse++;
      }
    }

    while (slotsInUse > newArraySize) {
      newArraySize *= 2;
    }

    int ii = 0;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] != null) {
        accountsCache[ii] = accounts[i];
        ii++;
      }
    }

    accounts = new Account[newArraySize];

    for (int i = 0; i < accountsCache.length; i++) {
      accounts[i] = accountsCache[i];
    }
  }
  
  /**
   * This method gives an account with the account number if there
   * is one that exists in the array. 
   * @param accountNumber is used to check whether the method has an account
   *     with this number
   * @return true or false if an account with the accountNumber exists or not 
   */
  public boolean containsAccount(int accountNumber) {
    if (getIndexOfAccountNumber(accountNumber) == -1) {
      return false;
    }
    return true;
  }

  
  /**
   * This is method represents the transfer between to account with certain 
   * conditions. 
   * @param fromAccountNumber variable for an account that withdraw 
   *     an amount of money
   * @param toAccountNumber variable for an account that gets deposited 
   * @param amount variable for value of transfer
   * @return true if it works and false if not
   */
  public boolean internalBankTransfer(int fromAccountNumber, int toAccountNumber, int amount) {
    int fromAccountNumberIndex = getIndexOfAccountNumber(fromAccountNumber);
    int toAccountNumberIndex = getIndexOfAccountNumber(toAccountNumber);

    if (accounts[fromAccountNumberIndex].getBankCode() != this.bankCode
          || accounts[toAccountNumberIndex].getBankCode() != this.bankCode) {
      return false;
    }

    if (!accounts[fromAccountNumberIndex].withdraw(amount)) {
      return false;
    }

    accounts[toAccountNumberIndex].deposit(amount);

    return true;
  }

  public int length() {
    return this.accounts.length;
  }
  
  /**
   * This method gives the number of the occupied cells of the array.
   * @return counter which counts plus one after every loop
   */
  public int size() {
    int counter = 0;
    for (int i = 0; i < accounts.length; i++) {
      if (accounts[i] != null) {
        counter++;
      }
    }
    return counter;
  }

  /**
   * This method gives the stored element with the index in the arry back. 
   * @param index is getting returned in the array field if it is larger than
   *     the length of the array minus one
   * @return accounts[index] the index in the array
   */
  public Account getAccount(int index) {
    if (index > accounts.length - 1) {
      return null;
    }
    return accounts[index];
  }
}