package net.java.model;

public class Employee {
	
	private int id;
	private String name;
	private int quantity;
	private float price;
	private String date;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


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


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + ", date="
				+ date + "]";
	}
	
	
	
	

}
