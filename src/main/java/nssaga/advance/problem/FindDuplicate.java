package nssaga.advance.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Find duplicates in O(n) time and O(1) extra space
 */
public class FindDuplicate {
	public static void main(String[] args) {
		FindDuplicate r = new FindDuplicate();
		r.removeDupElementFromArray();

		System.out.println("==========================");

		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("a");
		list.add("a");

		r.countDuplicatedElement(list);

		findDuplicateNumbersInList(list);

	}

	/**
	 * @Description Java Program to delete Duplicate elements in an array
	 */
	public void removeDupElementFromArray() {
		// array of ten elements
		int array[] = { 80, 10, 20, 30, 20, 40, 40, 50, 60, 70 };
		int size = array.length;
		System.out.println("Size before deletion: " + size);

		for (int i = 0; i < size; i++) { // Loop 1, complexity n
			for (int j = i + 1; j < size; j++) { // Loop 2, complexity n^2

				// checking one element with all the element
				if (array[i] == array[j]) {
					while (j < (size) - 1) {
						array[j] = array[j + 1];// shifting the values
						j++;
					}
					size--;
				}
			}
		}
		System.out.println("Size After deletion: " + size + "\n Elements");

		for (int k = 0; k < size; k++) {
			System.out.print(array[k] + ","); // printing the values
		}
	}

	/**
	 * @Description Java Program to count Duplicate elements in a list.
	 */
	public void countDuplicatedElement(List<String> list) {

		System.out.println("\nExample 1 - Count 'a' with frequency");
		System.out.println("a : " + Collections.frequency(list, "a"));

		System.out.println("\nExample 2 - Count all with frequency");
		Set<String> uniqueSet = new HashSet<>(list);
		for (String temp : uniqueSet) {
			System.out.println(temp + ": " + Collections.frequency(list, temp));
		}

		System.out.println("\nExample 3 - Count all with Map");
		Map<String, Integer> map = new HashMap<>();
		for (String temp : list) {
			Integer count = map.get(temp);
			map.put(temp, (count == null) ? 1 : count + 1);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

		System.out.println("\nSorted Map");
		Map<String, Integer> treeMap = new TreeMap<>(map);
		for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

	}

	// Start another method.
	/**
	 * @Description Method prints duplicate numbers in List and returns list of
	 *              non-duplicate numbers.
	 */
	public static List<String> findDuplicateNumbersInList(List<String> list) {
		List<String> listWithoutDuplicates = new ArrayList<>();
		System.out.println("list is: " + list);
		System.out.print("Duplicate numbers in list are: ");
		for (String i : list) {
			if (listWithoutDuplicates.contains(i))
				System.out.print(i + " ");
			else
				listWithoutDuplicates.add(i);
		}
		return listWithoutDuplicates;

	}
}
