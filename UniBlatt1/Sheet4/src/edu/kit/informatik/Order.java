package edu.kit.informatik;

public class Order {

  private int orderNumber;
  private int amount;
  private int customerNumber;
  private int articleId;

  /**
   * This method represents an order process.
   * @param orderData is a parameter of the method order
   */
  public Order(String orderData) {
    String[] orderDataSpilt = orderData.split(";");
    this.orderNumber = Integer.parseInt(orderDataSpilt[0]);
    this.customerNumber = Integer.parseInt(orderDataSpilt[1]);
    this.articleId = Integer.parseInt(orderDataSpilt[2]);
    this.amount = Integer.parseInt(orderDataSpilt[3]);
  }

  public int getOrderNumber() {
    return orderNumber;
  }

  public int getAmount() {
    return amount;
  }

  public int getCustomerNumber() {
    return customerNumber;
  }

  public int getArticleId() {
    return articleId;
  }
}
