/**
 09-Mar-2019		Nawal Sah
 ***********************************************************************************************************************
 */
package nssaga.beginner.e10exception;

public class ExceptionTheory {
}

/**
 * If developer writes program with wrong code, it can be wrong syntax or
 * abnormal condition or wrong logic which generates error by which program stop
 * its execution or normal work flow, which makes terrible to the application.
 * To handle such situation Java provides a mechanism called as Exception
 * Handling.
 * 
 * In Java errors are classified in 2 types.
 * 
 * A. Compile time error : If errors are generated at compile time means while
 * loading the .class file to JVM by class loader. Such errors are generated due
 * to writing wrong syntax like missing semicolon, keyword in upper case etc.
 * 
 * B. Runtime error : If errors are generated while running of program then it
 * is called as runtime error. Such types of error are generated due to writing
 * wrong business logic or abnormal condition.
 * 
 * Syntax errors can easily identified by the programmer but it very difficult
 * to identify the runtime error.
 * 
 * Runtime errors are classified into two types
 * 
 * 1. Error : An Error indicates serious problem that a reasonable application
 * should not try to catch. Such type of errors occurs mostly due to hardware
 * which can't be handle by the programmer. Error is irrecoverable e.g.
 * OutOfMemoryError, VirtualMachineError, AssertionError etc.
 * 
 * 2. Exception : An exception is an unwanted or unexpected event, which occurs
 * during the execution of a program i.e at run time, that disrupts the normal
 * flow of the program’s instructions and it must try to catch.
 * 
 * Exception is a special mechanism which is used to convert system error
 * message to user defined error message.
 * 
 * Generally Exception occurs due to writing wrong logic or abnormal condition
 * or wrong input by end user.
 * 
 * Syntax error is neither an Error nor an Exception because both of them happen
 * during runtime, and syntax error causes a compilation error which would
 * prevent the program from compiling and therefore from running.
 * 
 * By using exception handling mechanism we can maintain the normal flow of the
 * application
 * 
 * 
 */