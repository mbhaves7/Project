import java.util.Scanner;

public class MainArray {

	public static void main(String[] args) {
		int p[] = { 6, 5, 9, 1, 8, 4 };

		Scanner sc = new Scanner(System.in);

		
		for(int i=0;i<p.length;i++)
		{
			if(p[i]%2==0)
			{
				System.out.println( "even element of arry "+p[i]);
			}
			else
			{
				System.out.println("odd element  "+p[i]);
			}
		}
		
		
		
		System.out.println("\n\n\n\n\n\n\n\n\n");
		// Ascending Order
		System.out.println("enter the element of array");
		int as = sc.nextInt();
		int asd[] = new int[as];
		for (int i = 0; i < asd.length; i++) {
			System.out.print("print [" + i + "] =");
			asd[i] = sc.nextInt();
		}
		int t = 0;
		for (int i = 0; i < asd.length; i++) {
			for (int j = i + 1; j < asd.length; j++) {
				if (asd[i] > asd[j]) // for deascending order==>> if(asd[i]<asd[j])
				{
					t = asd[i];
					asd[i] = asd[j];
					asd[j] = t;
				}
			}
		}
		for (int i = 0; i < asd.length; i++) {
			System.out.println(" " + asd[i]);
		}
		System.out.println("\n\n");

		// elements of an array in reverse order

		for (int index = p.length - 1; index >= 0; index--) {
			System.out.println(p[index]);
		}
		System.out.println("\n\n\n");
		// elements of an array in reverse order
		int temp = 0;
		for (int i = 0; i < p.length; i++) {
			for (int j = i + 1; j < p.length; j++) {
				temp = p[i];
				p[i] = p[j];
				p[j] = temp;
			}
		}
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i]);
		}

		System.out.println("\n\n\nlength is " + p.length);
		// duplicate elements
		for (int i = 0; i < p.length; i++) {
			for (int j = i + 1; j < p.length; j++) {
				if (p[i] == p[j]) {
					System.out.println(p[j]);
				}
			}
		}
		// enter element of array and sum
		for (int index = 0; index < p.length; index++) {
			System.out.println(" " + p[index]);
		}
		System.out.print("enter element ");
		int a = sc.nextInt();
		int s[] = new int[a];

		for (int index = 0; index < s.length; index++) {
			System.out.println("element of array: [" + index + "] =");
			s[index] = sc.nextInt();
		}
		int sum = 0;
		for (int index = 0; index < s.length; index++) {
			sum = sum + s[index];
		}
		System.out.println("sum of array = " + sum);
		// search duplicate elements and count
		System.out.println("search of element of array =");
		int b = sc.nextInt();
		int c = 0;
		for (int index = 0; index < s.length; index++) {
			if (b == s[index]) {
				System.out.println("yes");
				c++;
			}
		}
		if (c > 0) {
			System.out.println("element of arr " + b + " is " + c + " times");
		} else {
			System.out.println(" no elemet found");
		}

	}
}
