/**
  Ex1.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 13-Oct-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e11string;

/**
 * in Java, a string is an object that represents a sequence of characters. The
 * java.lang.String class is used to create string object.
 * 
 * There are two ways to create a String object:
 * 
 * By string literal : Java String literal is created by using double quotes.
 * For Example: String s=“Welcome”; By new keyword : Java String is created by
 * using a keyword “new”. For example: String s=new String(“Welcome”);
 *
 * 
 */
public class Ex1 {
	public static void main(String[] args) {
		String str = "Hey, How are you";

		System.out.println(str.indexOf('a'));
		StringBuilder sb = new StringBuilder("Hey, How are you");

	}
}
