package com.arrayOfObjects;

import java.util.Scanner;

/*
 * Item class contains itemId,ItemName,itemCost.
     1.Create Array of Item with size 5 and display it.     
   2. Show itemNames with cost more than Rs.2000      
   3. Show item details with higest price.      
   4. Show average price of all items.       
   5. Increase the itemPrice by 200 whose itemPrice is below Rs.1000
 */
public class ItemArray {

	private static int getItemCost;
	int itemId;
	String itemName;
	double itemCost;

	public ItemArray() {
		itemId = 0;
		itemName = "";
		itemCost = 0.0;
	}

	public ItemArray(int itemId, String itemName, double itemCost) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCost = itemCost;
	}

	public void setItemId(int id) {
		this.itemId = id;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemName(String name) {
		this.itemName = name;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemCost(double cost) {
		this.itemCost = cost;
	}

	public double getItemCost() {
		return itemCost;
	}

	public String toString() {
		return " Item Id " + itemId + " Item Name " + itemName + " Item Cost " + itemCost;
	}

	public void costMoreThan2000(ItemArray a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].itemCost > 2000)
				System.out.println(a[i].itemName + " has price " + a[i].itemCost);
		}
	}

	public void highestPrice(ItemArray a[]) {
		double max = a[0].itemCost;
		for (int i = 0; i < a.length; i++) {
			if (a[i].itemCost > max)
				max = a[i].itemCost;
		}
		for (int i = 0; i < a.length; i++) {
			if (max == a[i].getItemCost())
				System.out.println(a[i].getItemName() + " has Highest Price " + a[i].getItemCost());
		}
	}
	public void averageCost(ItemArray a[]) {
		double sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i].itemCost;
		}
		double avg= sum/a.length;
		System.out.println("Average Cost of all Items is "+ avg);
	}
	
	public void costLessThan1000IncresasPriceBy200(ItemArray a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].itemCost < 1000)
				a[i].setItemCost(a[i].itemCost+200);
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ItemArray arr[] = new ItemArray[5];
		arr[0] = new ItemArray(1, "Pen", 500);
		arr[1] = new ItemArray(2, "Bag", 2200);
		arr[2] = new ItemArray(3, "Belt", 700);
		arr[3] = new ItemArray(4, "Watch", 2500);
		arr[4] = new ItemArray(5, "Headphones", 1700);

		ItemArray obj = new ItemArray();
		obj.costMoreThan2000(arr);
		obj.highestPrice(arr);
		obj.averageCost(arr);
		obj.costLessThan1000IncresasPriceBy200(arr);

		System.out.println();
		for(ItemArray a: arr)
			System.out.println(a+ "  ");
	}

}
