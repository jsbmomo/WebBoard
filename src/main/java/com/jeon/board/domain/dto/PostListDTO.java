package com.jeon.board.domain.dto;

import java.util.Date;

public class PostListDTO {

  private int seq;
  private String title;
  private String writer;
  private String content;
  private String kind;
  private char useAt;
  private char secret;
  private Date frstCreateTime;
  private Date lastUpdateTime;

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

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public char getUseAt() {
    return useAt;
  }

  public void setUseAt(char useAt) {
    this.useAt = useAt;
  }

  public char getSecret() {
    return secret;
  }

  public void setSecret(char secret) {
    this.secret = secret;
  }

  public Date getFrstCreateTime() {
    return frstCreateTime;
  }

  public void setFrstCreateTime(Date frstCreateTime) {
    this.frstCreateTime = frstCreateTime;
  }

  public Date getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(Date lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  @Override
  public String toString() {
    return "PostListDTO{" +
        "seq=" + seq +
        ", title='" + title + '\'' +
        ", writer='" + writer + '\'' +
        ", content='" + content + '\'' +
        ", kind='" + kind + '\'' +
        ", useAt=" + useAt +
        ", secret=" + secret +
        ", frstCreateTime=" + frstCreateTime +
        ", lastUpdateTime=" + lastUpdateTime +
        '}';
  }
}
