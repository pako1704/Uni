package edu.kit.informatik;

public class ChristmasList {
  private boolean run;
  private Manager manager;

  public ChristmasList() {
    this.run = true;
    this.manager = new Manager();
  }
  /**
   * This method validates the user input.
   */
  
  public void run() {
    do {
      this.run = validateInput(Terminal.readLine());
    } while (this.run);
  }

  private boolean validateInput(String userInput) {
    String[] userInputSplit = userInput.split(" ");
    switch (userInputSplit[0]) {
      case "quit":
        return false;
      case "add-customer":
        manager.addCustomer(userInputSplit[1]);
        Terminal.printLine("OK");
        return true;
      case "add-shoppingitem":
        manager.addItem(userInputSplit[1]);
        Terminal.printLine("OK");
        return true;
      case "order":
        manager.addOrder(userInputSplit[1]);
        Terminal.printLine("OK");
        return true;
      case "print":
        manager.print(userInputSplit[1]);
        return true;
      default:
        Terminal.printLine("Command not found");
        return true;
    }
  }
}
