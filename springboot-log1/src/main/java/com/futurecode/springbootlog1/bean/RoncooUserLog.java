package com.futurecode.springbootlog1.bean;

import java.util.Date;

@Entity
public class RoncooUserLog {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private Integer id;
@Column
private Date createTime;
@Column
private String userName;
@Column
private String userIp;
public Integer getId() {
return id;
}
public void setId(Integer id) {
this.id = id;
}
public Date getCreateTime() {
return createTime;
}
public void setCreateTime(Date createTime) {
this.createTime = createTime;
}
public String getUserName() {
return userName;
}
public void setUserName(String userName) {
this.userName = userName;
}
public String getUserIp() {
return userIp;
}
public void setUserIp(String userIp) {
this.userIp = userIp;
}
@Override
public String toString() {
return "RoncooUserLog [id=" + id + ", createTime=" + createTime + ", userName="
+ userName + ", userIp=" + userIp + "]";
}
}