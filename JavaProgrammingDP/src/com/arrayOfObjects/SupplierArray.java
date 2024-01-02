package com.arrayOfObjects;

import java.util.Arrays;

/*
 *Supplier class Contains supid,supName and array of itemsSUpplied.  
 *Item class contains itemId,ItemName,itemCost.           
 * 	1  Create 2 Item type arrays with size 5 and associate them with two Supplier objects.      
 * 	2. Show item details supplied by each supplier. */
public class SupplierArray {

	int supId;
	String supName;
	ItemArray itemsSupplied[];
	
	public SupplierArray() {
		supId=0;
		supName="";
		itemsSupplied= new ItemArray [1];
	}
	
	public SupplierArray(int supId, String supName, ItemArray[] itemsSupplied) {
		super();
		this.supId = supId;
		this.supName = supName;
		this.itemsSupplied = itemsSupplied;
	}


	public int getSupId() {
		return supId;
	}


	public void setSupId(int supId) {
		this.supId = supId;
	}


	public String getSupName() {
		return supName;
	}


	public void setSupName(String supName) {
		this.supName = supName;
	}


	public ItemArray[] getItemsSupplied() {
		return itemsSupplied;
	}


	public void setItemsSupplied(ItemArray[] itemsSupplied) {
		this.itemsSupplied = itemsSupplied;
	}

	

	@Override
	public String toString() {
		return "Supplier  [Suplier ID=" + supId + ", [Suplier Name=" + supName + ", Items Supplied="
				+ Arrays.toString(itemsSupplied) + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ItemArray arr1[] = new ItemArray[5];
		arr1[0] = new ItemArray(1, "Pen", 500);
		arr1[1] = new ItemArray(2, "Bag", 2200);
		arr1[2] = new ItemArray(3, "Belt", 700);
		arr1[3] = new ItemArray(4, "Watch", 2500);
		arr1[4] = new ItemArray(5, "Headphones", 1700);
		
		ItemArray arr2[] = new ItemArray[5];
		arr2[0] = new ItemArray(6, "Pencil", 200);
		arr2[1] = new ItemArray(7, "Bagage", 3000);
		arr2[2] = new ItemArray(8, "Shirts", 1000);
		arr2[3] = new ItemArray(9, "WristWatch", 2500);
		arr2[4] = new ItemArray(10, "Earphones", 900);
		
		
		
		SupplierArray obj1= new SupplierArray(01,"Yogesh",arr1);
		System.out.println(obj1);
		
		
		
		SupplierArray obj2= new SupplierArray(01, "Amit",arr2);
		System.out.println(obj2);
		
		
		
	}

}
