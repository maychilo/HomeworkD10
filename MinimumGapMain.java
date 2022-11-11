package codingmentorK3Algorithm;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class MinimumGapMain {
		public static void main(String[] args) {
			List<Integer> arr  = new ArrayList<Integer>(asList(7,1,3,4,1,7));
			int mingap = minimumGap(arr);
			System.out.println("gap " + mingap);
		}

		public static int minimumGap(List<Integer> arr) {
			int mingap = arr.size() - 1;
			int gap = 0;
			for (int i = 0; i < arr.size(); i++) {
				int tempNum = arr.get(i);
				for (int j = 0; j < arr.size(); j++) {
					if (tempNum == arr.get(j) & i != j) {
						gap = Math.abs(j - i);
					}
					if (mingap > gap & gap != 0) {
						mingap = gap;
					}
				}
			}
			if (gap == 0) {
				mingap = gap;
			}
			return mingap;
		}
	}


