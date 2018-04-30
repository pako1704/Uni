package edu.kit.informatik;

public class Item {
  private String article;
  private int articleId;
  private double singlePrice;

  /**
   * This constructor makes the userDataSplit to have a look for the ";" and 
   * is setting the variables on the first 3 array slots.
   * @param itemData helps to find the semicolon
   */
  public Item(String itemData) {
    String[] itemDataSplit = itemData.split(";");
    this.article = itemDataSplit[0];
    this.articleId = Integer.parseInt(itemDataSplit[1]);
    this.singlePrice = Double.parseDouble(itemDataSplit[2]);
  }

  public String getArticle() {
    return article;
  }

  public int getArticleId() {
    return articleId;
  }

  public double getSinglePrice() {
    return singlePrice;
  }

}
