/*----------------------------------------------
 Author		: Nawal Sah 
 File Name	: ExceptionHandleMsg.java
 Date		: 08-Sep-2017 

 ---------------------------------------------*/
package nssaga.beginner.e10exception;

/**
 *
 * @author Nawal Sah
 */
public class ExceptionHandleMsg {
	
	public static void main(String[] args) {
		try {
            String s = "FOOBAR";
            int i = Integer.parseInt(s);
            // this line of code will never be reached
            System.out.println("int value = " + i);
        }
        catch (NumberFormatException nfe) {
        	//nfe.printStackTrace(); //printStackTrace should be the first statement 
        	throw new NumberFormatException("Number format exception");
        }
	}

}
