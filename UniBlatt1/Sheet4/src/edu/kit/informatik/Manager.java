package edu.kit.informatik;

public class Manager {

  private Order[] orders;
  private Customer[] customers;
  private Item[] items;

  /**
   * This method adds a new customer either there is already one 
   * or not. If there isn't a customer yet the first slot will be
   * reserved. if there are already customers the customers in the
   * array will be copied in chachedCustomers and the first array
   * will turn one slot bigger. 
   * @param userData is the parameter for the new customer if there isn't already one
   */
  public void addCustomer(String userData) {
    if (this.customers == null) {
      this.customers = new Customer[1];
      this.customers[0] = new Customer(userData);
      return;
    }
    Customer[] cachedCustomers = new Customer[customers.length];
    for (int i = 0; i < cachedCustomers.length; i++) {
      cachedCustomers[i] = this.customers[i];
    }
    this.customers = new Customer[cachedCustomers.length + 1];
    for (int i = 0; i < cachedCustomers.length; i++) {
      this.customers[i] = cachedCustomers[i];
    }
    this.customers[this.customers.length - 1] = new Customer(userData);
  }

  /**
   * This method adds a new item either there is already one 
   * or not. If there isn't a item yet the first slot will be
   * reserved. if there are already items the items in the
   * array will be copied in chachedItems and the first array
   * will turn one slot bigger. 
   * @param itemData is the parameter for the new item if there isn't already one
   */
  public void addItem(String itemData) {
    if (this.items == null) {
      this.items = new Item[1];
      this.items[0] = new Item(itemData);
      return;
    }
    Item[] cachedItems = new Item[items.length];
    for (int j = 0; j < cachedItems.length; j++) {
      cachedItems[j] = this.items[j];
    }
    this.items = new Item[cachedItems.length + 1];
    for (int j = 0; j < cachedItems.length; j++) {
      this.items[j] = cachedItems[j];
    }
    this.items[this.items.length - 1] = new Item(itemData);
  }

  /**
   * This method adds a new order either there is already one 
   * or not. If there isn't a order yet the first slot will be
   * reserved. if there are already orders the orders in the
   * array will be copied in cachedOrders and the first array
   * will turn one slot bigger. 
   * @param orderData is the parameter for the new orders if there isn't already one
   */
  public void addOrder(String orderData) {
    if (this.orders == null) {
      this.orders = new Order[1];
      this.orders[0] = new Order(orderData);
      return;
    }
    Order[] cachedOrders = new Order[this.orders.length];
    for (int j = 0; j < cachedOrders.length; j++) {
      cachedOrders[j] = this.orders[j];
    }
    this.orders = new Order[cachedOrders.length + 1];
    for (int j = 0; j < cachedOrders.length; j++) {
      this.orders[j] = cachedOrders[j];
    }
    this.orders[this.orders.length - 1] = new Order(orderData);
  }

  /**
   * This method is printing into the methods.
   * @param userInput is the input of the user
   */
  public void print(String userInput) {
    int orderIndex = getIndexOfOrder(userInput);
    int itemIndex = getIndexOfItem(this.orders[orderIndex].getArticleId());
    int costumerIndex = getIndexOfCostumer(this.orders[orderIndex].getCustomerNumber());
    Terminal.printLine("(" + userInput + "," + this.customers[costumerIndex].getCustomerNumber()
        + "," + this.orders[orderIndex].getAmount() + ","
        + this.items[itemIndex].getArticle() + ","
        + this.items[itemIndex].getArticleId() + "," 
        + this.items[itemIndex].getSinglePrice() + ","
        + (this.items[itemIndex].getSinglePrice() * this.orders[orderIndex].getAmount()) + ")");
  }

  private int getIndexOfOrder(String userInput) {
    int orderNumber = Integer.parseInt(userInput);
    for (int i = 0; i < this.orders.length; i++) {
      if (this.orders[i].getOrderNumber() == orderNumber) {
        return i;
      }
    }
    return -1;
  }

  private int getIndexOfItem(int articleId) {
    for (int i = 0; i < this.items.length; i++) {
      if (this.items[i].getArticleId() == articleId) {
        return i;
      }
    }
    return -1;
  }

  private int getIndexOfCostumer(int customerNumber) {
    for (int i = 0; i < this.customers.length; i++) {
      if (this.customers[i].getCustomerNumber() == customerNumber) {
        return i;
      }
    }
    return -1;
  }
}
