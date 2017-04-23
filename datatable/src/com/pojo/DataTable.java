package com.pojo;

import java.util.List;

public class DataTable {
 
  private int draw;
  private List data;
  private int recordsTotal ;
  private int recordsFiltered ;
  private int start;
  private int length;
  private int nowpage;
  private int sEcho;
  private int  iDisplayStart;
  private int  iDisplayLength;
  
  
public int getNowpage() {
	return nowpage;
}
public void setNowpage(int nowpage) {
	this.nowpage = nowpage;
}
public int getDraw() {
	return draw;
}
public void setDraw(int draw) {
	this.draw = draw;
}
public List getData() {
	return data;
}
public void setData(List data) {
	this.data = data;
}
public int getRecordsTotal() {
	return recordsTotal;
}
public void setRecordsTotal(int recordsTotal) {
	this.recordsTotal = recordsTotal;
}
public int getRecordsFiltered() {
	return recordsFiltered;
}
public void setRecordsFiltered(int recordsFiltered) {
	this.recordsFiltered = recordsFiltered;
}


public int getStart() {
	return start;
}
public void setStart(int start) {
	this.start = start;
}
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getsEcho() {
	return sEcho;
}
public void setsEcho(int sEcho) {
	this.sEcho = sEcho;
}
public int getiDisplayStart() {
	return iDisplayStart;
}
public void setiDisplayStart(int iDisplayStart) {
	this.iDisplayStart = iDisplayStart;
}
public int getiDisplayLength() {
	return iDisplayLength;
}
public void setiDisplayLength(int iDisplayLength) {
	this.iDisplayLength = iDisplayLength;
}
@Override
public String toString() {
	return "DataTable [draw=" + draw + ", data=" + data + ", recordsTotal="
			+ recordsTotal + ", recordsFiltered=" + recordsFiltered
			+ ", start=" + start + ", length=" + length + ", nowpage="
			+ nowpage + ", sEcho=" + sEcho + ", iDisplayStart=" + iDisplayStart
			+ ", iDisplayLength=" + iDisplayLength + "]";
}





}
