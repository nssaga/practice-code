
package nssaga.beginner.collection.sort;

/**
 * https://www.geeksforgeeks.org/bubble-sort/
 * 
 */
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 3, 7, 4, 9, 10 };
		BubbleSort b = new BubbleSort();
		b.bubbleSort(arr);

		for (int a : arr) {
			System.out.println(a);
		}

	}

	/** sample algo **/
	void bubbleSort(int arr[]) {
		int len = arr.length;

		for (int i = 0; i < len - 1; i++) {
			for (int j = 0; j < len - 2; j++) {
				if (arr[j] > arr[j + 1]) {
					int swapVariable = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swapVariable;
				}
			}
		}
	}

	void optimezedBubbleSort(int arr[]) {
		int len = arr.length;
		int temp;

		for (int i = 0; i < len - 1; i++) {
			boolean swapped = false;

			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}

			// IF no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		}
	}
}
