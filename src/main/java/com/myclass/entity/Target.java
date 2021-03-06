package com.myclass.entity;

import javax.persistence.*;

@Entity
@Table(name = "targets")
public class Target {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String title;

  @Column(name = "course_id")
  private int courseId;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "course_id", insertable = false, updatable = false)
  private Course course;

  public Target(int id, String title, int courseId) {
    this.id = id;
    this.title = title;
    this.courseId = course.getId();
  }

  public Target() {
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

  public int getCourseId() {
    return courseId;
  }

  public void setCourseId(int courseId) {
    this.courseId = courseId;
  }

  public Course getCourse() {
    return course;
  }
}
