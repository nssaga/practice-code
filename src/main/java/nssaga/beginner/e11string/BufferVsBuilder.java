/**
  BufferVsBuilder.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 02-May-2019		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e11string;

/**
 * StringBuffer and StringBuilder are a mutable alternative of String class and
 * you can change the content without creating additional objects.
 * 
 * 1) StringBuffer was present in Java and StringBuilder was added in Java 5.
 * 
 * 2) Both StringBuffer and StringBuilder represents mutable String which means
 * you can add/remove characters, substring without creating new objects.
 * 
 * 3) You can convert a StringBuffer into String by calling toString() method.
 * 
 * 4) Both StringBuilder and StringBuffer doesn't override equals() and
 * hashCode() method because they are mutable and not intended to be used as a
 * key in hash-based collection classes e.g. HashMap, Hashtable, and HashSet.
 * 
 * 
 * 5) StringBuffer is synchronized which means all method which modifies the
 * internal data of StringBuffer is synchronized e.g. append(), insert() and
 * delete(). On contrary, StringBuilder is not synchronized.
 * 
 * 6) Because of synchronization StringBuffer is considered thread safe e.g.
 * multiple threads can call its method without compromising internal data
 * structure but StringBuilder is not synchronized hence not thread safe.
 * 
 * 
 * 7) Another side effect of synchronization is speed. Since StringBuffer is
 * synchronized its a lot slower than StringBuilder.
 * 
 * 8) The default length of StringBuffer is 16 characters. You should explicitly
 * define the size of it, especially if you know that size would be less or more
 * than 16 to avoid wasting memory and spending time during resize.
 * 
 * 9) In general, you should always use StringBuilder for String concatenation
 * and creating dynamic String unless and until you are absolutely sure that you
 * need StringBuffer.
 * 
 * 10) The string concatenation done using + (plus) operator internally uses
 * StringBuffer or StringBuilder depending upon which Java version you are
 * using. For example, if you are running in Java 5 or higher than StringBuilder
 * will be used and for the lower version, StringBuffer will be used.
 * 
 */
public class BufferVsBuilder {

}
