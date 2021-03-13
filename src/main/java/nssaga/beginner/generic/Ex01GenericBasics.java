/**
  Ex1GenericBasics.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 28-Apr-2019		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.generic;

/**
 * Code Reuse: We can write a method/class/interface once and use for any type
 * we want.
 * 
 * Type Safety : Generic make errors to appear compile time than at run time
 * (It’s always better to know problems in your code at compile time rather than
 * making your code fail at run time). Suppose you want to create an ArrayList
 * that store name of students and if by mistake programmer adds an integer
 * object instead of string, compiler allows it. But, when we retrieve this data
 * from ArrayList, it causes problems at runtime.
 * 
 * Individual Type Casting is not needed: If we do not use generic, then
 * every-time we retrieve data from ArrayList, we have to type cast it. Type
 * casting at every retrieval operation is a big headache. If we already know
 * that our list only holds string data then we need not to type cast it every
 * time.
 */
public class Ex01GenericBasics {

}
