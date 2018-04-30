package edu.kit.informatik;

import edu.kit.informatik.bank.Bank;
import edu.kit.informatik.konto.Account;

public class Main {

  /**
   * This method is the main method.
   */
  public static void main(String[] args) {
    MinimalList list = new MinimalList();
    list.add(new Account(123, 13), 5);
    list.print();
    list.add(new Account(123, 13), 2);
    System.out.println(list.size() + "-" + list.accounts.length);
    System.out.println("sdfasdf" + list.remove(2));
    list.print();
  }
}
