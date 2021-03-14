package array_list;

import java.util.ArrayList;

public class intersection {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 20, 30, 35, 40, 40, 50 };
		int[] arr2 = { 5, 7, 9, 10, 10, 10, 20, 25, 37, 40, 40, 40 };

		int m = Math.max(arr1[0], arr2[0]);

		ArrayList<Integer> list = new ArrayList<>();
		int c = Math.max(arr1.length, arr2.length);
		for (int i = 0, j = 0; i < arr1.length && j < arr2.length;) {

			if (arr1[i] < arr2[j])

				i++;

			else if (arr1[i] > arr2[j])
				j++;
			else {
				list.add(arr1[i]);
				i++;
				j++;

			}

		}
		System.out.println(list);
	}

}
