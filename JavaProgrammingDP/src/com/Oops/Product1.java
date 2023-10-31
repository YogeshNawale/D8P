package com.Oops;

public class Product1 {

	int pid;
	String pname, pdiscr, pcatagory;
	float discount,price_unit,totalprice,totaldiscount,discountedprice;
	int quantity;
	
	public void setData(int id, String name, String dis, String catag,
						float disc, float priceunit, int quant ) {
		pid=id;
		pname=name;
		pdiscr=dis;
		pcatagory=catag;
		discount=disc;
		price_unit=priceunit;
		quantity=quant;
	}
	
	public void calculateTotalPrice() {
		totalprice= price_unit*quantity;
		
	}

	public void calculateDiscount() {
		totaldiscount=(totalprice*discount)/100;
	}
	public void calculateDiscountedPrice() {
		discountedprice= totalprice-totaldiscount;
		
	}
	
	public void displayData() {
		
		System.out.println("Product ID "+ pid);
		System.out.println("Product Name "+ pname);
		System.out.println("Product Discription "+ pdiscr);
		System.out.println("Product Catogary "+ pcatagory);
		System.out.println("Product Price per Unit "+ price_unit);
		System.out.println("Product Total Price "+ totalprice);
		System.out.println("Product Discount "+ discount);
		System.out.println("Product Discounted Price "+ discountedprice);
		System.out.println("____________________");
		
		
	}
	
	
	public static void main(String[] args) {
		
		Product1 obj1= new Product1();
		obj1.setData(1, "Apple", "Kashmiri Apple", "Fruit", 20, 10, 12);
		obj1.calculateTotalPrice();
		obj1.calculateDiscount();
		obj1.calculateDiscountedPrice();
		obj1.displayData();
		
		Product1 obj2= new Product1();
		obj2.setData(2, "Orange", "Nagpur Orange", "Fruit", 15, 8, 12);
		obj2.calculateTotalPrice();
		obj2.calculateDiscount();
		obj2.calculateDiscountedPrice();
		obj2.displayData();
		
		
		
	}

}
