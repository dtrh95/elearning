package com.myclass.dto;

public class VideoDto {
  private int id;
  private String title;
  private String url;
  private int timeCount;

  public VideoDto(int id, String title, String url, int timeCount) {
    this.id = id;
    this.title = title;
    this.url = url;
    this.timeCount = timeCount;
  }

  public VideoDto() {
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

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public int getTimeCount() {
    return timeCount;
  }

  public void setTimeCount(int timeCount) {
    this.timeCount = timeCount;
  }
}
