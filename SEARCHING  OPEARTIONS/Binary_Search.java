package algorithms;

public class Binary_Search {
	public static void main(String[] args) {
		int[] biData = { 20, 31, 42, 49, 72, 444, 615, 617, 912, 1003 };
		boolean found = false;
		int a = 20;
		int startvar = 0;
		int endvar = biData.length - 1;
		while (startvar <= endvar) {
			int midvar = startvar + (endvar - startvar) / 2;
			if (biData[midvar] == a) {
				System.out.println("Element is found at index " + midvar + " : " + a);
				found = true;
				break;
			} else if (a < biData[midvar]) {
				endvar = midvar - 1;

			} else {
				startvar = midvar + 1;
			}
		}
		if (!found) {
			System.out.println("Element not found!!");
		}
	}
}
