package javaCoding;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = (int) scanner.nextLong();
		
		System.out.print("Enter the number of rotations: ");
		long rotations = scanner.nextLong();
		long[] arr = new long[size];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextLong();
		}
		scanner.close();
		long i, tmp;
		int j;
		if (size / 2 >= rotations) {
			for (i = 0; i < rotations; i++) {
				for (j = 1; j < size; j++) {
					tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
		else {
			for (i = 0; i < size - rotations; i++) {
				for (j = size - 2; j >= 0; --j) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		System.out.println("Array after "+ rotations + " number of rotation(s): ");
		for (long a : arr) {
			System.out.print(a + " ");
		}
	}
}
