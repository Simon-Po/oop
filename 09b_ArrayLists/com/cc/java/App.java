package com.cc.java;

import java.util.ArrayList;
import java.util.Collections;

public class App {

	public static void main(String[] args) {
		
		// ArrayList (AL) anlegen ...
		
		ArrayList<String> carMakers = new ArrayList<>();
		
		System.out.println(carMakers);
		System.out.println(carMakers.size());
		
		// // AL dynamisch füllen (JS --> push() / J --> add())
		carMakers.add("Volvo");
		carMakers.add("BMW");
		carMakers.add("Ford");
		carMakers.add("Honda");
		carMakers.add("Tesla");
		
		System.out.println(carMakers);
		System.out.println(carMakers.size());
		
		// Daten aus AL lesen
		System.out.println(carMakers.get(0));
		
		System.out.println("");
		System.out.println("------- Iteration 1 -----------");

		// Iteration 1
		for (int i = 0; i < carMakers.size(); i++) {
			System.out.print(carMakers.get(i) + " ");
		}

		System.out.println("");
		System.out.println("------- Iteration 2 ---------");
		
		// Iteration 2
		for (String element : carMakers) {
			System.out.print(element + " ");
		}	
		
		// // Daten in AL ersetzen / Überschreiben
		System.out.println("");
		carMakers.set(1, "MB");
		System.out.println(carMakers);
		
		System.out.println("");
		System.out.println("-------- sortiert: ------------");
		
		Collections.sort(carMakers);
		System.out.println(carMakers);
		System.out.println(carMakers.get(0));
		
		// Daten entfernen (JS --> pop(); J --> remove())
		
		carMakers.remove(0);
		System.out.println(carMakers);
		carMakers.remove(carMakers.size()-1);
		System.out.println(carMakers);
	
		 // AL leeren ...
		carMakers.clear();
		System.out.println(carMakers);
		
		// System.out.println("");
		// System.out.println("-------Thema: Wrapper -------------");
		
		ArrayList<String> strList = new ArrayList<>();
		ArrayList<Integer> intList = new ArrayList<>();
		// Lösung: Wrapper
		
		// int boo = 2;
		Integer boo = 2;
		System.out.println("Inhalt: " + boo.intValue());
		
		// ArrayList<Integer> intList = new ArrayList<>();
		// intList.add(10);
		// intList.add(11);
		// intList.add(12);
		
		// System.out.println(intList);
		
	
	}

	
	
}
