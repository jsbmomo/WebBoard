package com.jeon.board.reply.dto;


public class ReplyDTO {

  private int seq;
  private int contentNumber;
  private String id;
  private String writer;
  private String comment;
  private char secret;

  public int getSeq() {
    return seq;
  }

  public void setSeq(int seq) {
    this.seq = seq;
  }

  public int getContentNumber() {
    return contentNumber;
  }

  public void setContentNumber(int contentNumber) {
    this.contentNumber = contentNumber;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public char getSecret() {
    return secret;
  }

  public void setSecret(char secret) {
    this.secret = secret;
  }

  @Override
  public String toString() {
    return "ReplyDTO{" +
        "seq=" + seq +
        ", contentNumber=" + contentNumber +
        ", id='" + id + '\'' +
        ", writer='" + writer + '\'' +
        ", comment='" + comment + '\'' +
        ", secret='" + secret + '\'' +
        '}';
  }

}
