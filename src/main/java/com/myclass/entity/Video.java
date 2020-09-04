package com.myclass.entity;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.persistence.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;

@Entity
@Table(name = "videos")
public class Video {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String title;

  private String url;

  @Column(name = "time_count")
  private int timeCount;

  @Column(name = "course_id")
  private int courseId;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "course_id", insertable = false, updatable = false)
   private Course course;

  public Video(int id, String title, String url, int courseId) {
    this.id = id;
    this.title = title;
    this.url = url;
    getTimeCount();
    this.courseId = course.getId();
  }

  public Video() {
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
    getTimeCount();
  }

  public int getTimeCount() {
    return timeCount;
  }

  public void setTimeCount(int timeCount) {
    this.timeCount = timeCount;
  }

  public int getCourseId() {
    return courseId;
  }

  public void setCourseId(int courseId) {
    this.courseId = courseId;
  }

  public void getVideoLength() {
    String videoId = this.url.split("/")[3];
    String apiKey = "AIzaSyBpWGq730fpufMNL4ORFbia3G783tfgZ_g";
    String sURL = "https://www.googleapis.com/youtube/v3/videos?id=" + videoId +"&part=contentDetails&key=" + apiKey;
    Object inputStreamJSON = null;
    String JSON = "";
    try {
      URL url = new URL(sURL);
      URLConnection request = url.openConnection();
      request.connect();
      inputStreamJSON = request.getContent();
      JsonElement jp = JsonParser.parseReader(new InputStreamReader((InputStream) inputStreamJSON));
      JsonObject jsonObject = jp.getAsJsonObject();
      JsonArray objects = jsonObject.get("items").getAsJsonArray();
      JSON = objects
        .get(0)
        .getAsJsonObject()
        .get("contentDetails")
        .getAsJsonObject()
        .get("duration")
        .getAsString();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    long duration = Duration.parse(JSON).getSeconds();
    System.out.println(duration);
    this.timeCount = (int) duration;
  }
}
