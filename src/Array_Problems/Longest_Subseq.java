package Array_Problems;

import java.util.Arrays;
import java.util.HashSet;

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

		// better approach//

		int maxlen2 = longestConsecutive1(arr);

		// -----efficient approach---/
		int maxLen1 = longestConsecutive(arr);

	}

	private static int longestConsecutive1(int[] nums) {

		Arrays.sort(nums);

		// HashSet<Integer> set=new HashSet<>();

		Arrays.sort(nums);

		int cnt = 1, max = 0, lastSmaller = Integer.MIN_VALUE;

		for (int ele : nums) {
			if (ele - 1 == lastSmaller) {
				cnt++;
				lastSmaller = ele;
			} else if (ele != lastSmaller) {
				cnt = 1;
				lastSmaller = ele;
			}
			max = Math.max(max, cnt);
		}

		return max;

	}

	public static int longestConsecutive(int[] nums) {

		/*--logic--*
		-->we will simply store the element in the set.
		--> Then we will check that element -1 is present in the set or not
		because if it is present then we will just skip for the current element 
		as to avoid uneccessary iterations which will make our code efficient.
		--> if it's not present then will take the current element and check for
		whether current element + 1 is present in the set or not if it's present
		then simply increment the cnt and element by 1.
		--> At last just find the maxlen.
		
		 */
		HashSet<Integer> set = new HashSet<>();

		for (int ele : nums) {
			set.add(ele);
		}

		int maxLen = 0;

		for (int ele : nums) {

			if (!set.contains(ele - 1)) {
				int cnt = 1, x = ele;

				while (set.contains(x + 1)) {
					cnt++;
					x = x + 1;
				}

				maxLen = Math.max(maxLen, cnt);
			}

		}

		return maxLen;
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
