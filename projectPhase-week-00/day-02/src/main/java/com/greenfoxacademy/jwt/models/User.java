package com.greenfoxacademy.jwt.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

  @Id
  @Column(length = 50)
  private String userName;
  @Column(length = 200)
  private String password;

  public User(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  public User() {
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

/*
package com.greenfoxacademy.springwebapp.models.dao;


public class Player {

private int id;
private String username;
private String email;
private int kingdom;
private String avatar;
private int points;

  public Player() {
  }


}
 */

