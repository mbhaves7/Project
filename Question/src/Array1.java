import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };

		for (int index = 0; index <= a.length; index++) {
			System.out.println(a[index]);
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size:");
		int s = sc.nextInt();
		int arr[] = new int[s];

		for (int index = 0; index <= arr.length; index++) {
			System.out.print("enter value of array " + index + ":");
			arr[index] = sc.nextInt();
		}
		int sum = 0;
		for (int index = 0; index <= arr.length; index++) {
			sum = sum + arr[index];
		}
		System.out.println("sum of array" + sum);
		System.out.println("find element2");

	}
}
