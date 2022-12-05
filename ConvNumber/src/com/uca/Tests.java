/*
	Noms : TSHIBUABUA & RASANDISON
	Prenoms : Kenny & Marc
*/
package com.uca;

import org.junit.jupiter.api.Test;

import jdk.jfr.Timestamp;

import java.util.concurrent.Callable;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class Tests {
	
	@Test
	public void testConverter(){
        //Test de reussite
		assertThat(RomanConverter.getRomanFromNumber(4), equalTo("IV"));
        assertThat(RomanConverter.getRomanFromNumber(2), equalTo("II"));
        assertThat(RomanConverter.getRomanFromNumber(20), equalTo("XX"));
        assertThat(RomanConverter.getRomanFromNumber(15), equalTo("XV"));

        assertThat(RomanConverter.getNumberFromRoman("XX"), equalTo(20));
        assertThat(RomanConverter.getNumberFromRoman("V"), equalTo(5));
        assertThat(RomanConverter.getNumberFromRoman("XVI"), equalTo(16));
        assertThat(RomanConverter.getNumberFromRoman("III"), equalTo(3));

        //Test d'echec
		assertThat(exceptionOf(() -> RomanConverter.getRomanFromNumber(-2)), instanceOf(IllegalArgumentException.class));
        //assertThat(exceptionOf(() -> RomanConverter.getRomanFromNumber("3.3")), instanceOf(IllegalArgumentException.class));
        assertThat(exceptionOf(() -> RomanConverter.getRomanFromNumber(0)), instanceOf(IllegalArgumentException.class));
        assertThat(exceptionOf(() -> RomanConverter.getRomanFromNumber(4100)), instanceOf(IllegalArgumentException.class));
        
        assertThat(exceptionOf(() -> RomanConverter.getNumberFromRoman("XXXX")), instanceOf(IllegalArgumentException.class));
        assertThat(exceptionOf(() -> RomanConverter.getNumberFromRoman("VV")), instanceOf(IllegalArgumentException.class));
        assertThat(exceptionOf(() -> RomanConverter.getNumberFromRoman("VX")), instanceOf(IllegalArgumentException.class));
        assertThat(exceptionOf(() -> RomanConverter.getNumberFromRoman("XCX")), instanceOf(IllegalArgumentException.class));

        //Test de validite
        for(int i=1; i <= 3999; i++)
        {
           assertThat(RomanConverter.getNumberFromRoman(RomanConverter.getRomanFromNumber(i)),equalTo(i)); 
        }

	}

 
/* CETTE METHODE PERMET DE COMPARER 

public static void compare(RomanNumber Roman, RomanNumber Number )
 {
        
        Roman = new RomanNumber("X");
        Number = new RomanNumber(13);

        assertThat(Number.compareTo("IX"),equalTo(0));
        assertThat(compareTo("XL"), equalTo(0));
        assertThat(Roman.compareTo("XXV"), equalTo(1));
        assertThat(Roman.compareTo(40), equalTo(0));
        assertThat(Roman.compareTo("M"), equalTo(-1));


    }
    */ //la methode compare indique "symbole no found "
   
	


    //Help you to handle exception. :-)
    public static Throwable exceptionOf(Callable<?> callable) {
        try {
            callable.call();
            return null;
        } catch (Throwable t) {
            return t;
        }
    }
}
