package com.myclass.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String title;

  private String image;

  @Column(name = "letures_count")
  private int lecturesCount;

  @Column(name = "hour_count")
  private int hourCount;

  @Column(name = "view_count")
  private int viewCount;

  private int price;

  private int discount;

  @Column(name = "promotion_price")
  private int promotionPrice;

  private String description;

  private String content;

  @Column(name = "category_id")
  private int categoryId;

  @Column(name = "last_update")
  private Timestamp lastUpdate;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "category_id", insertable = false, updatable = false)
  private Category category;

  @OneToMany(fetch = FetchType.LAZY)
  List<Target> targets;

  @OneToMany(fetch = FetchType.LAZY)
  List<Video> videos;

  public Course(
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
    Timestamp lastUpdate
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
  }

  public Course() {
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

  public void setCategory(Category category) {
    this.category = category;
  }

  public List<Target> getTargets() {
    return targets;
  }

  public void setTargets(List<Target> targets) {
    this.targets = targets;
  }

  public List<Video> getVideos() {return videos; }

  public void setVideos(List<Video> videos) {
    this.videos = videos;
  }
}
