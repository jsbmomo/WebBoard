package com.jeon.board.domain.story.dto;

import java.util.Date;

public class StoryDTO {

  private int seq;
  private String title;
  private String content;
  private Date regDate;
  private String renewal;
  private int views;

  public int getSeq() {
    return seq;
  }

  public void setSeq(int seq) {
    this.seq = seq;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Date getRegDate() {
    return regDate;
  }

  public void setRegDate(Date regDate) {
    this.regDate = regDate;
  }

  public String getRenewal() {
    return renewal;
  }

  public void setRenewal(String renewal) {
    this.renewal = renewal;
  }

  public int getViews() {
    return views;
  }

  public void setViews(int views) {
    this.views = views;
  }

  @Override
  public String toString() {
    return "StoryDTO{" +
        "seq=" + seq +
        ", title='" + title + '\'' +
        ", content='" + content + '\'' +
        ", regDate=" + regDate +
        ", renewal='" + renewal + '\'' +
        ", views=" + views +
        '}';
  }
}
