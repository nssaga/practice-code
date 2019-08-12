/**
  User.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 25-Aug-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.enums;

import java.util.Arrays;

/**
 * Like variable enum enhance the readability of the program. For example an
 * authorization set have many role like user, admin etc if we decide to code 0
 * for user and 1 for admin and so on. Program will not readable and later on if
 * program is to be modified, the task may be difficult if program is not
 * properly documented. However if we use role categories as enum, the program
 * will be more readable.
 * 
 * derived data type.
 * 
 * enum means enumeration i.e. mention (a number of things) one by one.
 * 
 * An enum is a data type that contains fixed set of constants.
 * 
 * OR
 * 
 * An enum is just like a class, with a fixed set of instances known at compile
 * time.
 * 
 * Advantages of enum:
 * 
 * it provides type safety.
 * 
 * enum improves type safety at compile-time checking to avoid errors at
 * run-time. enum can be easily used in switch enum can be traversed enum can
 * have fields, constructors and methods enum may implement many interfaces but
 * cannot extend any class because it internally extends Enum class
 * 
 * Java Enum Important Points .
 * 
 * All java enum implicitly extends java.lang.Enum class that extends Object
 * class and implements Serializable and Comparable interfaces. So we can’t
 * extend any class in enum.
 * 
 * Since enum is a keyword, we can’t end package name with it, for example
 * com.journaldev.enum is not a valid package name.
 * 
 * Enum can implement interfaces.
 * 
 * Enum constructors are always private.
 * 
 * We can’t create instance of enum using new operator.
 * 
 * We can declare abstract methods in java enum, then all the enum fields must
 * implement the abstract method.
 * 
 * Enumeration being used as a singleton pattern so it gives thread safety
 * benefits.
 * 
 * We can define a method in enum and enum fields can override them too. For
 * example, toString() method is defined in enum and enum field START has
 * overridden it.
 * 
 * Java enum fields has namespace, we can use enum field only with class name
 * like ThreadStates.START
 * 
 * Enums can be used in switch statement.
 * 
 * We can extend existing enum without breaking any existing functionality. For
 * example, we can add a new field NEW in ThreadStates enum without impacting
 * any existing functionality.
 * 
 * Since enum fields are constants, java best practice is to write them in block
 * letters and underscore for spaces. For example EAST, WEST, EAST_DIRECTION
 * etc.
 * 
 * Enum constants are implicitly static and final
 * 
 * Enum constants are final but it’s variable can still be changed. For example,
 * we can use setPriority() method to change the priority of enum constants.
 * 
 * Since enum constants are final, we can safely compare them using “==” and
 * equals() methods. Both will have the same result.
 * 
 */
public enum Ex01User {
	USER((byte) 0),
	ADMIN((byte) 1),
	NOT_SUPPORTED((byte) -1);

	private Byte value;

	/**
	 * Initialize value for name
	 * 
	 * @param value
	 */
	private Ex01User(Byte value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public byte getValue() {
		return value;
	}

	/**
	 * Get string name by value
	 * 
	 * @param value
	 * @return
	 */
	public String getName(byte value) {
		return Arrays.stream(Ex01User.values()).filter(user -> user.getValue() == value).findFirst()
				.orElse(NOT_SUPPORTED).name();
	}

	/**
	 * Get value for enum string name.
	 * 
	 * @param name
	 * @return
	 */
	public Byte getValue(String name) {
		return Arrays.stream(Ex01User.values()).filter(user -> user.name().equalsIgnoreCase(name)).findFirst()
				.orElse(NOT_SUPPORTED).getValue();
	}

	/**
	 * Get enum name for value
	 * 
	 * @param value
	 * @return
	 */
	public static Ex01User getEnum(byte value) {
		return Arrays.stream(Ex01User.values()).filter(user -> user.getValue() == value).findFirst()
				.orElse(NOT_SUPPORTED);
	}
}
