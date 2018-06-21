import java.util.Scanner;

public class array {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myIntArray = getIntegers(5);
		myIntArray = sortIntegers(myIntArray);
		printArray(myIntArray);
	}

	private static int[] getIntegers(int number) {
		System.out.println("Enter " + number + " integers:\r");
		int[] values = new int[number];

		for(int i=0; i<values.length; i++) {
			values[i] = scanner.nextInt();
		}

		return values;
	}

	private static void printArray(int[] array) {

		for (int i=0; i<array.length; i++ ) {
			System.out.println("Index " + i + ": " + array[i]);
		}

	}

	private static int[] sortIntegers(int[] array) {

		for (int i=0; i<array.length; i++) {
			for (int j=i; j<array.length; j++) {
				if (array[j] > array[i]) {
					int placeholder = array[i];
					array[i] = array[j];
					array[j] = placeholder;
				}
			}
		}

		return array;
	}

}