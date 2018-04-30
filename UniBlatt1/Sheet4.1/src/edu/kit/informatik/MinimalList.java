package edu.kit.informatik;

import edu.kit.informatik.konto.Account;

public class MinimalList {
  public Account[] accounts;

  /**
   * This method adds an account on the first free slot.
   * @param account is the parameter of an object Account
   */
  public void add(Account account) {
    if (this.accounts == null) {
      this.accounts = new Account[1];
      this.accounts[0] = account;
    } else {
      if (this.accounts[this.accounts.length - 1] != null) {
        setSize(this.accounts.length + 1);
      }
      this.accounts[this.accounts.length - 1] = account;
    }
  }

  /**
   * This method adds an other account.
   * @param account is the parameter of an object Account
   * @param index is needed to get the first index of the free slot
   */
  public void add(Account account, int index) {
    if (this.accounts == null) {
      setSize(index + 1);
      this.accounts[index] = account;
    } else if (index < this.accounts.length && this.accounts[index] == null) {
      this.accounts[index] = account;
    } else if (this.accounts[index] != null) {
      add(account);
    } else {
      setSize(index + 1);
      this.accounts[index] = account;
    }
  }

  /**
   * This method returns a true if there is an account transfer.
   * @param index1 is an parameter to notice the first index
   * @param index2 is an parameter to notice the second index
   * @param amount is the amount that has to be transfered
   * @return true if the transaction works
   */
  public boolean transfer(int index1, int index2, int amount) {
    if (this.accounts[index1].withdraw(amount)) {
      this.accounts[index2].deposit(amount);
      return true;
    }
    return false;
  }

  /**
   * This method returns true if there is an account that has to be removed.
   * @param index is an parameter to notice the index
   * @return true if there is an account that has to be deleted
   */
  public boolean remove(int index) {
    if (this.accounts != null && this.accounts.length > index && this.accounts[index] != null) {
      this.accounts[index] = null;
      return true;
    } else {
      return false;
    }
  }

  /**
   * This method is the getter for the firstname. 
   * @return null if there is no account
   */
  public Account getFirst() {
    if (this.accounts == null) {
      return null;
    }
    for (int i = 0; i < this.accounts.length; i++) {
      if (this.accounts[i] != null) {
        return this.accounts[i];
      }
    }
    return null;
  }

  /**
   * This method is the getter for the lastname. 
   * @return null if there is no account
   */
  public Account getLast() {
    if (this.accounts == null) {
      return null;
    }
    for (int i = this.accounts.length - 1; i > 0; i++) {
      if (this.accounts[i] != null) {
        return this.accounts[i];
      }
    }
    return null;
  }

  /**
   * This method is the getter the object account.
   * @param index is the parameter of this method
   * @return null if there is no account
   */
  public Account get(int index) {
    if (this.accounts == null) {
      return null;
    }
    return new Account(1, 1);
  }

  /**
   * This method returns true if there is an index of getAcount.
   * @param account is the parameter of this method
   * @return null if there is no account
   */
  public boolean contains(Account account) {
    if (this.accounts == null) {
      return false;
    }
    for (int i = 0; i < this.accounts.length; i++) {
      if (account.getAccountNumber() == this.accounts[i].getAccountNumber()) {
        return true;
      }
    }
    return false;
  }

  /**
   * This method gives the size. 
   * @return 0 if there is no account
   */
  public int size() {
    if (this.accounts == null) {
      return 0;
    }
    int counter = 0;
    for (int i = 0; i < this.accounts.length; i++) {
      if (this.accounts[i] != null) {
        counter++;
      }
    }
    return counter;
  }

  private void setSize(int length) {
    if (this.accounts == null) {
      this.accounts = new Account[length];
    }

    if (length <= this.accounts.length) {
      return;
    }
    Account[] cachedAccounts = new Account[this.accounts.length];
    for (int i = 0; i < this.accounts.length; i++) {
      cachedAccounts[i] = this.accounts[i];
    }

    this.accounts = new Account[length];
    for (int i = 0; i < cachedAccounts.length; i++) {
      this.accounts[i] = cachedAccounts[i];
    }
  }

  /**
   * This method prints true or false if there is an account at the slot
   * with the index i.
   */
  public void print() {
    for (int i = 0; i < this.accounts.length; i++) {
      if (this.accounts[i] == null) {
        System.out.println("false");
      } else {
        System.out.println("true");
      }
    }
  }
}
