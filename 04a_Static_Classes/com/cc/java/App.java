package com.cc.java;

public class App {

	static String preStr = "Das Ergebnis ist: ";
	
	public static void main(String[] args) {
		
		RechnerInst rechnerInst = new RechnerInst();
		
		ausgabe("Ergebnis: " + rechnerInst.summe(1, 1));
		ausgabe("Ergebnis: " + rechnerInst.differenz(5, 1));
		ausgabe("Ergebnis: " + rechnerInst.produkt(2, 3));
		ausgabe("Ergebnis: " + rechnerInst.quotient(2, 4));
		
		ausgabe("-------------------------");

		ausgabe(preStr + RechnerStat.summe(1, 1));
		ausgabe(preStr + RechnerStat.differenz(5, 1));
		ausgabe(preStr + RechnerStat.produkt(2, 3));
		ausgabe(preStr + RechnerStat.quotient(2, 4));
		
		ausgabe(preStr + Math.PI);
		
	}

	
	static void ausgabe(String outStr){
		System.out.println(outStr);
	}
	
	
} // EoC
