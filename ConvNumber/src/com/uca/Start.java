/*
	Noms : TSHIBUABUA & RASANDISON
	Prenoms : Kenny & Marc
*/

package com.uca;

public class Start{
	
	//Start class
	public static void main(String[] args){

		System.out.println(" *****************");
		System.out.println(" Bonjour :) .... ");
		System.out.println(" *****************");
		System.out.println(" Ce programme traite sur le sujet des Chiffres Romains  .... ");

		RomanNumber roman = new RomanNumber("IV");
		System.out.println(" En decimal : "+roman.getValue());
		System.out.println(" En chiffre romain : "+roman.getRoman());
		
		int n = 3;
		System.out.println(" La valeure de "+n+" en chiffre romain est: " + RomanConverter.getRomanFromNumber(n));
		System.out.println(" "+roman.compareTo(n));

		n = 10;
		System.out.println(" La valeure de "+n+" en chiffre romain est: " + RomanConverter.getRomanFromNumber(n));
		System.out.println(" "+roman.compareTo(n));

		String r = "II";
		System.out.println(" La valeure de "+r+" en chiffre decimal est : " + RomanConverter.getNumberFromRoman(r));
		System.out.println(" "+roman.compareTo(r));
		
		r = "LVII";
		System.out.println(" La valeure de "+r+" en chiffre decimal est : " + RomanConverter.getNumberFromRoman(r));
		System.out.println(" "+roman.compareTo(r));

		r = "IV";
		System.out.println(" La valeure de "+r+" en chiffre decimal est : " + RomanConverter.getNumberFromRoman(r));
		System.out.println(" "+roman.compareTo(r));

		
		System.out.println(" *****************************");
		//TODO
		//Aide pour démarrer : https://git.artheriom.fr/l3-informatique-2020-2021/site-l3/-/tree/master/Genie_Logiciel/HelperTP3
		//Aussi : https://www.youtube.com/watch?v=567_hWQJYak
	}
	
}