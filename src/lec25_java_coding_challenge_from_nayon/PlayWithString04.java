package lec25_java_coding_challenge_from_nayon;

public class PlayWithString04 {

	public static void main(String[] args) throws Exception {
		// Custom string input
		String str = "jyz5wLXAPBq9c3m80";

		// Converting string into an array for computation
		char arr[] = str.toCharArray();
		// System.out.println(Arrays.toString(arr));
		char temp;
		// Nested loops for comparison of characters in above character array
		for (int i = 0; i <= arr.length; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[j] < arr[i]) {
					// Comparing the characters one by one
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// By now loop is done means we have
		// iterated the whole array
		System.out.println(arr);
	}

}
