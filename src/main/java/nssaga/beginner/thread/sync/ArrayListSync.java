package nssaga.beginner.thread.sync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Nawal Sah
 */
public class ArrayListSync {
	List<String> list = Collections.synchronizedList(new ArrayList<String>());
	
	ArrayListSync(){
		list.add("One");
		list.add("Two");
		list.add("Three");
	}
	
	public static void main(String[] args) {
		ArrayListSync a = new ArrayListSync();
		System.out.println(a.list);
	}
	
}
