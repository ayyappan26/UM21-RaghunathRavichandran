package com.ultramain.vehicleexample;

public class VechicleExample
{
	public static void main(String arg[])
	{
		Car mycar=new Car();
		//mycar.carType();
		mycar.vechicleType();
	}
}
class Vechicle
{
	public void vechicleType()
	{
		System.out.println("Type of the vechicle");
	}
}
class Car extends Vechicle
{
	public void carType()
	{
		System.out.println("Type of the car");
	}
}