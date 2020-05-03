package nssaga.beginner.collection.sort;

/**
 * https://www.javamadesoeasy.com/2015/01/insertion-sort.html
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 2, 7, 3, 9, 5, 78, 34 };
		InsertionSort is = new InsertionSort();
		is.insertionSort(arr);
		
		for (int a : arr) {
			System.out.println(a);
		}
		
	}

	public void insertionSort(int arr[]) {
		int index = 0;
		int inner;
		int tempValue;
		
		for (int outer = 1; outer < index; outer++) { // outer is dividing line
			tempValue = arr[outer]; // remove marked element
			inner = outer; // start shifts at outer
			while (arr[inner - 1] >= tempValue) { // until one is smaller,
				arr[inner] = arr[inner - 1]; // shift elements to right
				--inner; // go one position left
			}

			arr[inner] = tempValue; // insert marked element at inner position
			
		}
	} // End insertion sort method
}
