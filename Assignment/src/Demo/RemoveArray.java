package Demo;

import java.util.Scanner;

public class RemoveArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter element of array");
		int arr = sc.nextInt();
		int re[] = new int[arr];
		for (int i = 0; i < re.length; i++) {
			System.out.print("elemet posion[" + i + "]=");
			re[i] = sc.nextInt();
		}
		System.out.println("which posiotion remove");
		int p = sc.nextInt();
		int k = 0;
		int temp[] = new int[re.length - 1];

		for (int i = 0; i < re.length; i++) {
			if (p == re[i]) {
				for (int j = i; j < re.length; j++) {
					re[j] = re[j + 1];
				}
				break;
			}
}
		for(int i=0;i<re.length;i++)
		{
			System.out.println("new list of array [" + i + "] is " + re[i]);

		}
sc.close();
	}

}
