package Einfuehrung01;

import java.util.Scanner;

public class StartPoint {
  public static void main(String[] args) {
    int start = 0;
    System.out.println("Enter an Integer: ");
    Scanner inputUser = new Scanner(System.in);
    int finish;
    if (inputUser.hasNextInt()) {
      finish = inputUser.nextInt();
      System.out.println("Enter a String: ");
    } else {
      finish = 1;
      System.out.println("Play by the rules, enter a String!");
    }
    
    Scanner inputWords = new Scanner(System.in);
    String words = inputWords.nextLine();
    while (start < finish) {
      System.out.print(words);
      start++;
    }
  }
}
