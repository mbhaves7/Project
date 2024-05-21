/*Write a program in Java to make such a pattern like right angle triangle with number
increased by 1 The pattern like:
1
2 3
4 5 6
7 8 9 10 
 */

package Demo;

public class Q_06_PatternTriangleWithNumberwith1 {
	public static void main(String[] args) {

		int n = 1;
		for (int i = 1; i <= 4; i++) { // triangle with a number increased by 1 using for.... loop
			for (int j = 1; j <= i; j++) {// column print
				System.out.print(n + " ");// print number
				n++;
			}
			System.out.println("");
		}
	}
}
