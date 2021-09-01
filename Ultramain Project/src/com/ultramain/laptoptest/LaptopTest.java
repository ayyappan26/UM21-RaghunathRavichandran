package com.ultramain.um21.laptopTest;

import com.ultramain.um21.display.Display;
import com.ultramain.um21.laptop.Laptop;

public class LaptopTest
{
	public static void main(String arg[])
	{
		Laptop lap=new Laptop();
		lap.setModel("HP1201");
		lap.setcompanyName("HP");
		lap.setprocessorType("i10");
		lap.setramSize("4gb");
		lap.setpurchaseYear(2017);
		
		
		Laptop lap1=new Laptop();
		lap1.setcompanyName("LENOVO");
		lap1.setModel("Think Pad");
		lap1.setprocessorType("i11");
		lap1.setramSize("16 GB");
		lap1.setpurchaseYear(2019);
		
		Display display=new Display();
		display.displayDetails(lap);
		display.displayDetails(lap1);
	}
}