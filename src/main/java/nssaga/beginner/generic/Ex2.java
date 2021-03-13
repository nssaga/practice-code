/**
  Ex2.java
 ***********************************************************************************************************************
 Description: 	

 Revision History:
 -----------------------------------------------------------------------------------------------------------------------
 Date         	Author               	Reason for Change
 -----------------------------------------------------------------------------------------------------------------------
 06-Oct-2020		Nawal Sah				Initial Version

 Copyright (c) 2020,
 ***********************************************************************************************************************
 */
package nssaga.beginner.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		int a[] = { 5, 6, 7, 83, 34, 12, 34, 345 };
		// swap(a, 0, 1);

		List<Integer> list = new ArrayList<>();
		;
		list.add(12);
		list.add(41);
		list.add(22);
		list.add(32);
		list.add(31);

		System.out.println(Algorithm.max(list, 0, 4));

		// diffType(list);

	}

	public static <T> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;

		System.out.println(a);
	}

	/**
	 * Can You Pass List<string> To A Method Which Accepts List<object>?<br>
	 * It looks like String is object so List<String> can be used where List<Object>
	 * is required but this is not true. It will result in compilation error. It
	 * does make sense if you go one step further because List<Object> can store any
	 * any thing including String, Integer etc but List<String> can only store
	 * Strings.
	 */
	public static void diffType(List<Object> objects) {
		System.out.println(objects);
	}
}

/**
 * When compiled then compiler will erase K and V and it will be replaced by
 * Object and Object
 */
class Pair<K, V> {
	private K key;
	private V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

}

/**
 * Write a generic method to find the maximal element in the range [begin, end)
 * of a list.
 */
class Algorithm {
	public static <T extends Object & Comparable<? super T>> T max(List<? extends T> list, int begin, int end) {
		T maxElem = list.get(begin);
		for (++begin; begin < end; ++begin)
			if (maxElem.compareTo(list.get(begin)) < 0)
				maxElem = list.get(begin);
		return maxElem;
	}
}
