package edu.kit.informatik;

public class Customer {

  private String firstName;
  private String lastName;
  private int customerNumber;
  
  /**
   * This constructor makes the userDataSplit to have a look for the ";" and 
   * is setting the variables on the first 3 array slots.
   * @param userData helps to find the semicolon
   */
  public Customer(String userData) {
    String[] userDataSplit = userData.split(";");
    this.firstName = userDataSplit[0];
    this.lastName = userDataSplit[1];
    this.customerNumber = Integer.parseInt(userDataSplit[2]);
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getCustomerNumber() {
    return customerNumber;
  }

}
