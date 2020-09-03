package com.myclass.dto;

import com.myclass.entity.Category;

import java.sql.Timestamp;

public class CourseDto {
  private int id;
  private String title;
  private String image;
  private int lecturesCount;
  private int hourCount;
  private int viewCount;
  private int price;
  private int discount;
  private int promotionPrice;
  private String description;
  private String content;
  private int categoryId;
  private Timestamp lastUpdate;
  private Category category;

  public CourseDto(
    int id,
    String title,
    String image,
    int lecturesCount,
    int hourCount,
    int viewCount,
    int price,
    int discount,
    int promotionPrice,
    String description,
    String content,
    int categoryId,
    Timestamp lastUpdate,
    Category category
  ) {
    this.id = id;
    this.title = title;
    this.image = image;
    this.lecturesCount = lecturesCount;
    this.hourCount = hourCount;
    this.viewCount = viewCount;
    this.price = price;
    this.discount = discount;
    this.promotionPrice = promotionPrice;
    this.description = description;
    this.content = content;
    this.categoryId = categoryId;
    this.lastUpdate = lastUpdate;
    this.category = category;
  }

  public CourseDto() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public int getLecturesCount() {
    return lecturesCount;
  }

  public void setLecturesCount(int lecturesCount) {
    this.lecturesCount = lecturesCount;
  }

  public int getHourCount() {
    return hourCount;
  }

  public void setHourCount(int hourCount) {
    this.hourCount = hourCount;
  }

  public int getViewCount() {
    return viewCount;
  }

  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getDiscount() {
    return discount;
  }

  public void setDiscount(int discount) {
    this.discount = discount;
  }

  public int getPromotionPrice() {
    return promotionPrice;
  }

  public void setPromotionPrice(int promotionPrice) {
    this.promotionPrice = promotionPrice;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(int categoryId) {
    this.categoryId = categoryId;
  }

  public Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public Category getCategory() {
    return category;
  }
}



