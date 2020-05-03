package nssaga.beginner.collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Demonstrating union, intersection and difference on Set
 */
public class Ex02Set {
	public static void main(String[] args) {
		Integer[] a = { 1, 3, 2, 4, 8, 9, 0 };
		Integer[] b = { 1, 3, 7, 5, 4, 0, 7, 5 };

		Set<Integer> aset = new HashSet<>(Arrays.asList(a));
		Set<Integer> bset = new HashSet<>(Arrays.asList(b));

		// union of two set of values
		Set<Integer> union = new HashSet<>(aset);
		union.addAll(bset);
		System.out.println("union  -  " + union);

		// intersection of two set of values
		Set<Integer> intersection = new HashSet<>(aset);
		intersection.retainAll(bset);
		System.out.println("intersection   -  " + intersection);

		// symmetric difference of two set
		Set<Integer> symetric = new HashSet<>(aset);
		symetric.removeAll(bset);
		System.out.println("symetric  -  " + symetric);

	}
}
