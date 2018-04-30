package learning;

import java.util.Scanner;

public class testing {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		Bank sparkasse = new Bank(2145153);
		sparkasse.createAccount(100);
		sparkasse.createAccount(42);
		sparkasse.createAccount(1);
		sparkasse.deleteAccount(42);
		sparkasse.createAccount(1);
		sparkasse.createAccount(2);
		sparkasse.printAccounts();
		
	}
}
