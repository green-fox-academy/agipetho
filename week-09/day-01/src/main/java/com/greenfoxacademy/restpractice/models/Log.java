/*
Create a log object which has the following fields:
createdAt - date and time
endpoint - string
data - string
 */
package com.greenfoxacademy.restpractice.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Log {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Temporal(TemporalType.TIMESTAMP)
  private Date createdAt;

  private String endpoint;
  private String data;


  public Log() {
    this.createdAt = new Date();
  }

  public Log(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
    this.createdAt = new Date();
  }
}
