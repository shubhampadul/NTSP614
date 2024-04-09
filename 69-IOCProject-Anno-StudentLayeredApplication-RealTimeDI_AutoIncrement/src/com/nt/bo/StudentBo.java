package com.nt.bo;

/*SQL> create table student2 (sno number(10),sname varchar2(20),saddrs varchar2(20), total number(10), avg number(10),result varchar2(5));

Table created.

SQL> desc student2;
 Name                                      Null?    Type
 ----------------------------------------- -------- ----------------------------
 SNO                                                NUMBER(10)
 SNAME                                              VARCHAR2(20)
 SADDRS                                             VARCHAR2(20)
 TOTAL                                              NUMBER(10)
 AVG                                                NUMBER(10)
 RESULT                                             VARCHAR2(5)
*/

public class StudentBo {

	private String sname;
	private String saddrs;
	private int    total;
	private double avg;
	private String result;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddrs() {
		return saddrs;
	}
	public void setSaddrs(String saddrs) {
		this.saddrs = saddrs;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	

	
}
