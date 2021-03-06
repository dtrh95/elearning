package com.myclass.dto;

import com.myclass.entity.Course;

public class TargetDto {
  private int id;
  private String title;
  private int courseId;
  private Course course;

  public TargetDto(int id, String title, int courseId, Course course) {
    this.id = id;
    this.title = title;
    this.courseId = courseId;
    this.course = course;
  }

  public TargetDto() {
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
}
