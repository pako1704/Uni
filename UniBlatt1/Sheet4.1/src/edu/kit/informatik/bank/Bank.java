package edu.kit.informatik.bank;

import edu.kit.informatik.MinimalList;
import edu.kit.informatik.konto.Account;

public class Bank {
  private int bankCode;
  private MinimalList accounts;

  public Bank(int bankCode) {
    this.bankCode = bankCode;
    this.accounts = new MinimalList();
  }

  public int getBankCode() {
    return this.bankCode;
  }

  /**
   * This method creates an account.
   * @param accountNumber is a parameter for the method 
   * @return 0 
   */
  public int createAccount(int accountNumber) {
    Account newAccount = new Account(this.bankCode, accountNumber);
    this.accounts.add(newAccount);
    return 0;
    // int size = this.accounts.size();
    // if(size==0){
    // this.accounts.add(newAccount);
    // return 0;
    // }
    // int accountCounter = 0, indexCounter = 0;
    // while(accountCounter<size){
    // if(this.accounts.get(indexCounter)!=null){
    // if(this.accounts.get(indexCounter).getAccountNumber() >
    // newAccount.getAccountNumber()){
    // break;
    // }
    // accountCounter++;
    // }
    // indexCounter++;
    // }
    // if(accountCounter==size){
    // this.accounts.add(newAccount);
    // return indexCounter;
    // }
    // Account[] cachedAccounts = new Account[size-accountCounter];
    // int cachedIndex = 0;
    // while(accountCounter<size) {
    // if(this.accounts.get(indexCounter)!=null){
    // cachedAccounts[cachedIndex] = this.accounts.get(indexCounter);
    // accountCounter++;
    // cachedIndex++;
    // }
    // indexCounter++;
  }

  /**
   * This method removes an account.
   * @param accountNumber is a parameter for the method 
   * @return true 
   */
  public boolean removeAccount(int accountNumber) {
    int accountCounter = 0;
    int indexCounter = 0;
    while (accountCounter < this.accounts.size()) {
      if (this.accounts.get(indexCounter) != null) {
        if (this.accounts.get(indexCounter).getAccountNumber() == accountCounter) {
          this.accounts.remove(indexCounter);
          return true;
        }
        accountCounter++;
      }
      indexCounter++;
    }
    return false;
  }

  /**
   * This method transfers money from one account to another
   * @param fromAccountNumber is an parameter to know from which account
   * @param toAccountNumberis an parameter to know to which account
   * @param amount is the amount that has to be transfered
   * @return false if fromAccountIndex = -1 oder toAccountIndex = -1
   */
  public boolean transfer(int fromAccountNumber, int toAccountNumber, int amount) {
    int fromAccountIndex = getIndexByAccountNumber(fromAccountNumber);
    int toAccountIndex = getIndexByAccountNumber(toAccountNumber);
    if (fromAccountIndex == -1 || toAccountIndex == -1) {
      return false;
    }
    return this.accounts.transfer(fromAccountIndex, toAccountIndex, amount);
  }

  private int getIndexByAccountNumber(int accountNumber) {
    int accountCounter = 0;
    int indexCounter = 0;
    while (accountCounter < this.accounts.size()) {
      if (this.accounts.get(indexCounter) != null) {
        if (this.accounts.get(indexCounter).getAccountNumber() == accountNumber) {
          return indexCounter;
        }
        accountCounter++;
      }
      indexCounter++;
    }
    return -1;
  }

  public boolean containsAccount(int accountNumber) {
    return this.accounts.contains(new Account(this.bankCode, accountNumber));
  }

  /**
   * This method gives the length.
   * @return indexCounter counts the index
   */
  public int length() {
    int accountCounter = 0;
    int indexCounter = 0;
    while (accountCounter < this.accounts.size()) {
      if (this.accounts.get(indexCounter) != null) {
        accountCounter++;
      }
      indexCounter++;
    }
    return indexCounter;
  }

  public Account getAccount(int index) {
    return this.accounts.get(index);
  }
}
