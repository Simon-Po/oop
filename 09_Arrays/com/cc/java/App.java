package com.cc.java;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

      	// Deklaration: int
		// int [] intArr = new int [4];
		// output("Länge Array: " + intArr.length);	
		
		// // Index
		// output("3. Element " + intArr[2]);
		
		// intArr[0] = 10;
		// output("1. Element " + intArr[0]);
		// intArr[intArr.length - 1] = 11;
		
		// for (int i = 0; i < intArr.length; i++) {
		// 	output("Element: " + i + " : "+ intArr[i]);
		// }
			
		// Deklaration: String
		// String [] strArr = new String [2];
		// String [] strArr = {"Hallo","Nikola"};
		
		// for (int i = 0; i < strArr.length; i++) {
		// 	output("Element: " + strArr[i]);
		// }
		
		
		// Mehrdimensionale Arrays
		// String [][] strMdArr = new String [2][2];
		
		// String [][] strMdArr = {{"Max","Mustermann"},{"Maxine","Musterfrau"}};
		
		// {{0,2,1},{1,0,0}}  x|y|z
		
		// output(strMdArr[0][0]);
		// output(strMdArr[1][1]);
		
		// // nested loops
		// for (int i = 0; i < strMdArr.length; i++) {
		// 	for (int j = 0; j < strMdArr.length; j++) {
		// 		output("Indizes i/j: " + "i:" +  i + " j:"+ j + " " + strMdArr[i][j]);
		// 	}
		// }
		
		// Deklaration | Chars
		char [] letters = {'d','c','a','A','b'};
	
	// 	output("");
	// 	output("---- vor Sortierung: ");
	// 	for (int i = 0; i < letters.length; i++) {
	// 		output(letters[i]);	
	// 	}

	// 	// Sortierfkt. --> sortiertes Array
	// 	Arrays.sort(letters);  // Statische Klasse | Methode

	// 	output("");
	// 	output("---- nach Sortierung: ");
	// 	for (int i = 0; i < letters.length; i++) {
	// 		output(letters[i]);	
	// 	}

	// 	// output("");
	// 	// output("---- Suche: erfolgreich ----");
	// 	// ... danach Suche (1)
	// 	int searchIndex = Arrays.binarySearch(letters,'a');
	// 	output("");
	// 	output("---- Binäre Suche: ");
	// 	output("searchIndex: " + searchIndex);
	
	// 	// output("---- Suche: erfolglos ----");
	// 	// ... danach Suche (2)
	// 	searchIndex = Arrays.binarySearch(letters,'e');
	// 	output("searchIndex: " + searchIndex);  // -(length+1)
	// 	// .... isInArray()
		
	// 	output("---- fill() ----");
	// 	//.. Array füllen
	// 	Arrays.fill(letters, '0');
	// 	for (int i = 0; i < letters.length; i++) {
	// 		output((letters[i]));
	// 	}

    // }

    private static void output(String outStr) {
        System.out.println(outStr);
    }

	// überladene Methode
	private static void output(char outChar) {
		System.out.print(outChar);
    }


}
