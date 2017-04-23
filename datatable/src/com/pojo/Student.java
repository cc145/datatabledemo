package com.pojo;

public class Student {
   private int id ;
   private String name;
   private String location;
   private String sex;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", location=" + location
			+ ", sex=" + sex + "]";
}

}
