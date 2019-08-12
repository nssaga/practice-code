/**
  ClassNotFoundEx.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 28-Apr-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e10exception;

/**
 * Both ClassNotFoundException and NoClassDefFoundError occurs when a particular
 * class is not found during the run time, but at different scenarios.
 * 
 * ClassNotFoundException occurs when you try to load a class dynamically using
 * Class.forName() or ClassLoader.loadClass() or ClassLoader.findSystemClass()
 * methods, while the NoClassDefFoundError occurs when the class is found during
 * the compile time but not at the run time.
 * 
 * Most of the times this exception occurs when we miss to update the Class path
 * with the required Jars. Suppose when we try connect to a database using JDBC
 * then we need to update the class path with the database driver JARs
 */
public class ClassNotFoundEx {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL Driver Missing!!!");
			e.printStackTrace();
		}
	}
}
