/*Write a program in Java to display the pattern like right angle triangle with a number.
1
12
123
1234
12345 
*/
package Demo;

public class Q_05_PatternTriangleWithNumber {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) { // triangle with a number using for.... loop
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
