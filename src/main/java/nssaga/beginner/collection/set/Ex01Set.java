/**
  Ex01Set.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 08-May-2019		Nawal Sah				Initial Version

 Copyright (c) 2018,
 ***********************************************************************************************************************
 */
package nssaga.beginner.collection.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Set is an interface which extends Collection. It is an unordered collection
 * of objects means doesn't guarantee for insertion order and duplicate values
 * cannot be stored and guarantee for unique value
 * 
 * Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted
 * representation).
 * 
 * Set has various methods to add, remove clear, size, etc to enhance the usage
 * of this interface
 * 
 * Default clone of HashSet shallow copy. The internal elements are not cloned.
 * A shallow copy only copies the reference object.
 * 
 * HashSet does not provide any way to compare objects.
 * 
 * Set doesn't allow to get element by index.
 * 
 * Collections.emptySet() return Immutable Set, it is useful in multi-threaded
 * environment. One does not need to declare generic type collection. It is
 * inferred by the context of method call.
 * 
 * Set has contains(Object o) method instead of get(Object o) method as get is
 * needed for comparing object and getting corresponding value.
 * 
 * SortedSet is an interface. It maintains an ordered set of elements. TreeSet
 * is an implementation of SortedSet.
 * 
 * TreeSet provides fail-fast iterator. Hence when concurrently modifying TreeSet it throws ConcurrentModificationException.
 */
public class Ex01Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("nawal");
		set.add("kumar");
		set.add("sah");
		set.add("kumar"); // duplicate entry will override the previous value and won't give any issue or
							// exception
		set.add("sah"); // duplicate entry will override the previous value.

		set.add("");
		set.add("");

		set.add(null); // adding null value
		set.add(null); // no exception but it will override the previous null, hence there will be only
						// one null value

		for (String str : set) {
			System.out.println(str);
		}

	}
}
