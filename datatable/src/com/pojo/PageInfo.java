package com.pojo;

public class PageInfo {
   private int total;
   private int start;
   private int end;
public int getTotal() {
	return total;
}
public void setTotal(int total) {
	this.total = total;
}
public int getStart() {
	return start;
}
public void setStart(int start) {
	this.start = start;
}
public int getEnd() {
	return end;
}
public void setEnd(int end) {
	this.end = end;
}
@Override
public String toString() {
	return "PageInfo [total=" + total + ", start=" + start + ", end=" + end
			+ "]";
}
   
}
