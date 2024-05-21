import java.util.Scanner;

public class SelectionSorting {

	public static void array(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("33.0");
	}

	public static void selection(int a[]) {

		for (int i = 1; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int a[] = { 90, 55, 10, 77, 61, 2, 7, 59 };
		int min, temp;
		for (int i = 0; i < a.length; i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[min]) {
					min = j;

				}
			}
			temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		selection(a);

		int arr[] = { 29, 99, 55, 15, 38, 51, 1, 98, 3 };
		for (int i = 1; i < arr.length; i++) {
			int tem = arr[i];
			int j = i - 1;
			while (j >= 0 && tem < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = tem;
		}
		array(arr);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");

		int x = sc.nextInt();
		int y = Math.abs(x);

		System.out.println("valyte of " + x + "is ="+y);

	}
}
