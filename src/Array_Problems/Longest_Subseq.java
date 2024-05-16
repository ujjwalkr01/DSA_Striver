package Array_Problems;

public class Longest_Subseq {

	public static void main(String[] args) {

		int arr[] = new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };

		int maxLen = 0;

		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i], cnt = 1;

			while (findEle(arr, ele + 1)) {
				ele += 1;
				cnt++;
			}
			maxLen = Math.max(maxLen, cnt);
		}

		System.out.println(maxLen);
	}

	public static boolean findEle(int arr[], int ele) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) {
				return true;
			}
		}
		return false;
	}

}
