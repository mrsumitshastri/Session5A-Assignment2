package com.Session5.Assignment2;

public class BuildingExample {

	/*
	 * Write a program to print the details of different types of buildings using inheritance.
	 */
	public static void main(String[] args) {
		
		Regidantial res1 = new Regidantial(13,3);
		Commercial com1 = new Commercial(210,40);
		
		Commercial com2 = new Commercial(500,70);
		Regidantial res2 = new Regidantial(20,10);
		
		res1.print();
		res2.print();
		com1.print();
		com2.print();
	}
	
	
}


class Building
{
	protected int numberOfRooms;
	protected String buildingType;
	protected int numberOfBathRooms;

}

class Regidantial extends Building
{
	public Regidantial(int rooms , int bathrooms)
	{
		this.buildingType = "Regidantial";
		this.numberOfRooms = rooms;
		this.numberOfBathRooms = bathrooms;
	}
	public void print()
	{
		System.out.println("---------------------------------------------");
		System.out.println("Building Type : "+ this.buildingType);
		System.out.println("Number of rooms in this building : "+ this.numberOfRooms);
		System.out.println("Number of bathRoom in this building: "+ this.numberOfBathRooms);
	}
	
}

class Commercial extends Building
{
	public Commercial(int rooms , int bathrooms)
	{
		this.buildingType = "Commercial";
		this.numberOfRooms = rooms;
		this.numberOfBathRooms = bathrooms;
	}
	public void print()
	{
		System.out.println("---------------------------------------------");
		System.out.println("Building Type : "+ this.buildingType);
		System.out.println("Number of rooms in this building : "+ this.numberOfRooms);
		System.out.println("Number of bathRoom in this building: "+ this.numberOfBathRooms);
	}	
}