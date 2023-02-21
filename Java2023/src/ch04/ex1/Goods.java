package ch04.ex1;

public class Goods 
{
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
	public int getSold() {
		return sold;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setNumberOfStock(int numberOfStock) {
		this.numberOfStock = numberOfStock;
	}
	public void setSold(int sold) {
		this.sold = sold;
	}
	
	
}
