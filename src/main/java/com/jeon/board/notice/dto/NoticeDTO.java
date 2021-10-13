package com.jeon.board.notice.dto;

import java.sql.Timestamp;
import java.util.Date;

public class NoticeDTO {

  private int seq;
  private String title;
  private String writer;
  private String content;
  private Timestamp frst_create_time;
  private Date last_update_time;


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

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Timestamp getFrst_create_time() {
    return frst_create_time;
  }

  public void setFrst_create_time(Timestamp frst_create_time) {
    this.frst_create_time = frst_create_time;
  }

  public Date getLast_update_time() {
    return last_update_time;
  }

  public void setLast_update_time(Date last_update_time) {
    this.last_update_time = last_update_time;
  }

  @Override
  public String toString() {
    return "NoticeDTO{" +
        "seq=" + seq +
        ", title='" + title + '\'' +
        ", writer='" + writer + '\'' +
        ", content='" + content + '\'' +
        ", frst_create_time='" + frst_create_time + '\'' +
        ", last_update_time='" + last_update_time + '\'' +
        '}';
  }
}
