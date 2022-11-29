package com.cc.java;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		// Vorüberlegung
		// Cat cat = new Cat("Grizabella");
		// // output(cat.getAttributes());
		
		//cat1 / cat2 .. more of the same ...DRY
		// for (int i = 0; i < 10; i++) 
		// {
		// 	new Cat("someone_" + i); // Objekt, aber KEINE Referenz!
		// }
		
		String [] nameArr = {"Grizabella","Alonzo", "RumTumTugger","Suzanne"};
		ArrayList<Cat> objList = new ArrayList<>();

		for (int i = 0; i < nameArr.length; i++) 
		// for (int i = 0; i < 4; i++) 
		{
			objList.add(new Cat(nameArr[i]));
			output("Cats: " + objList);

			objList.add(new Cat("someone_" + i));
		

		}

		output("Cats: " + objList);
		output(objList.get(0).getAttributes());
		output(objList.get(1).getAttributes());
		output(objList.get(objList.size()-1).getAttributes());
		

	}
	
	public static void output(String outStr) {
		System.out.println(outStr);
	}

}
