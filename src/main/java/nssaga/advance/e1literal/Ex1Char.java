/**
  CharEX.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 05-Jun-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.advance.e1literal;

public class Ex1Char {
	public static void main(String[] args) {
		//char ch = a; // CT error: Cann't find symbol
		//char ch1 = "a"; //CT error: incompatible types
		//char ch2 = 'av'; // CT : unclosed char literal
		//char ch3 = '0XBear'; // invalid, out of rage of hexa
		
		char ch4 = 97; // print UNICODE value , range 0 to 65535
		char CH5 = 0xFace; //correct, print UNICODE value
		//char ch6 = 656536; // invalid,  possible loss of precision , found int , required char
		// if you get question mark for int value that means this UNICODE number not present in your system
		
		//char ch7 = '/u0061'; // print 61, /u represent UNICODE (which is hexadecimal)
		char ch8 = '\t'; //every escape character is valid char literal, total 8 escape char
				// valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
		//char ch9 = '\m'; //invalid escape  char literal
		
		//System.out.println(ch);
	}
}
