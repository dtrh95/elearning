package com.myclass.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String title;

  private String icon;

  @OneToMany(fetch = FetchType.LAZY)
  List<Course> courses;

  public Category(int id, String title, String icon) {
    this.id = id;
    this.title = title;
    this.icon = icon;
  }

  public Category() {
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

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }
}
