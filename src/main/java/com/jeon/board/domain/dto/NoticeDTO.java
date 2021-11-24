package com.jeon.board.domain.dto;


public class NoticeDTO {

  private int seq;
  private String title;
  private String writer;
  private String content;
  private String first_create_time;
  private String last_update_time;

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

  public String getFirst_create_time() {
    return first_create_time;
  }

  public void setFirst_create_time(String first_create_time) {
    this.first_create_time = first_create_time;
  }

  public String getLast_update_time() {
    return last_update_time;
  }

  public void setLast_update_time(String last_update_time) {
    this.last_update_time = last_update_time;
  }

  @Override
  public String toString() {
    return "NoticeDTO{" +
        "seq=" + seq +
        ", title='" + title + '\'' +
        ", writer='" + writer + '\'' +
        ", content='" + content + '\'' +
        ", first_create_time='" + first_create_time + '\'' +
        ", last_update_time='" + last_update_time + '\'' +
        '}';
  }
}
