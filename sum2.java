package array_list;

import java.util.ArrayList;

public class sum2 {

	public static void main(String[] args) {

		int[] a = { 9, 9, 8, 9 };
		int[] b = { 7, 6 };
		int carry = 0;
		int i = a.length - 1;
		int j = b.length - 1;
		ArrayList<Integer> ans = new ArrayList<>();

		while (i >= 0 || j >= 0) {
			int sum = carry;
			if (i >= 0)
				sum += a[i];
			if (j >= 0)
				sum += b[j];

			int rem = sum % 10;
			ans.add(0, rem);
			carry = sum / 10;
			i--;
			j--;

		}
		if (carry > 0) {
			ans.add(0, carry);
		}
		System.out.println(ans);
	}

}
