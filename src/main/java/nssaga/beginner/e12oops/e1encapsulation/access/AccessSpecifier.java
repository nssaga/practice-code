/**
  AccessSpecifier.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 02-Sep-2018		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.e12oops.e1encapsulation.access;

/**
 * JAVA ACCESS SPECIFIERS
 * 
 * The access to classes, constructors, methods and fields are regulated using
 * access modifiers i.e. a class can control what information or data can be
 * accessible by other classes. To take advantage of encapsulation, you should
 * minimize access whenever possible.
 * 
 * Java provides a number of access modifiers to help you set the level of
 * access you want for classes as well as the fields, methods and constructors
 * in your classes. A member has package or default accessibility when no
 * accessibility modifier is specified.
 * 
 * Access Modifiers
 * 
 * 1. public 2. private 3. protected 4. default
 * 
 * public access modifier
 * 
 * Fields, methods and constructors declared public (least restrictive) within a
 * public class are visible to any class in the Java program, whether these
 * classes are in the same package or in another package.
 * 
 * private access modifier
 * 
 * The private (most restrictive) fields or methods cannot be used for classes
 * and Interfaces. It also cannot be used for fields and methods within an
 * interface. Fields, methods or constructors declared private are strictly
 * controlled, which means they cannot be accesses by anywhere outside the
 * enclosing class, this way we can add security. A standard design strategy is
 * to make all fields private and provide public getter methods for them.
 * 
 * What is the use of a Private Constructors? Can we assign private keyword to
 * the constructor ? If yes then why?
 * 
 * When we make the Constructor as private then object for the class can only be
 * created internally within the class, no outside class can create object for
 * this class. Using this we can restrict the caller from creating objects and
 * preventing object creation from outside class (Singleton Design Pattern). When
 * we still try to create object we will be getting the error message "The
 * constructor SingletonExample() is not visible"
 * 
 * protected access modifier
 * 
 * The protected fields or methods cannot be used for classes and Interfaces. It
 * also cannot be used for fields and methods within an interface. Fields,
 * methods and constructors declared protected in a superclass can be accessed
 * only by subclasses in other packages. Classes in the same package can also
 * access protected fields, methods and constructors as well, even if they are
 * not a subclass of the protected member’s class.
 * 
 * default access modifier
 * 
 * Java provides a default specifier which is used when no access modifier is
 * present. Any class, field, method or constructor that has no declared access
 * modifier is accessible only by classes in the same package. The default
 * modifier is not used for fields and methods within an interface.
 * 
 * Below is a program to demonstrate the use of public, private, protected and
 * default access modifiers while accessing fields and methods. The output of
 * each of these java files depict the Java access specifiers.
 * 
 * 
 * Non-access modifiers : In java, we have 7 non-access modifiers. They are used
 * with classes, methods, variables, constructors etc to provide information
 * about their behavior to JVM.They are static, final, abstract, synchronized,
 * transient, volatile, native
 */
public class AccessSpecifier {

}
