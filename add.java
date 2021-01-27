package array_list;

import java.util.ArrayList;

public class add {

	public static void main(String[] args) {

		int[] a = { 9, 9, 8, 9 };
		int[] b = { 7, 6 };

		ArrayList<Integer> list = new ArrayList<>();
		int n = a.length - 1;
		int m = b.length - 1;
		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < a.length; i++) {

			sum1 += a[i] * Math.pow(10, n);
			n--;
		}

		// System.out.println(sum1);

		for (int i = 0; i < b.length; i++) {

			sum2 += b[i] * Math.pow(10, m);
			m--;
		}
		// System.out.println(sum2);
		int k = sum1 + sum2;

		int l = 0;
		while (k > 0) {
			l = k % 10;
			list.add(l);
			k = k / 10;
		}
		System.out.print("[");
		for (int i = list.size() - 1; i >= 0; i--) {
			if (i >= 1)
				System.out.print(list.get(i) + ",");
			else
				System.out.print(list.get(i));

		}
		System.out.print("]");
	}

}
