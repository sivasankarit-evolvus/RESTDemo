package com.example.ss.entity;

/*import org.hibernate.annotations.Entity;

@Entity*/
public class ProductEntity {
	private int pid;
	private String pname;
	private double price;
	public ProductEntity() {
		
	}
	public ProductEntity(int pid, String pname, double price){
		this.pid=pid;
		this.pname=pname;
		this.price=price;
	}
	public int getPid() {
		return pid;
	}
	public String getPname() {
		return pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPid(int pid) {
		this.pid=pid;
	}
	public void setPname(String pname) {
		this.pname=pname;
	}
	public void setPrice(double price) {
		this.price=price;
	}
}
