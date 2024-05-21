/*Create a class to print an integer and a character with two methods having the same
name but different sequence of the integer and the character parameters. For
example, if the parameters of the first method are of the form (int n, char c), then
that of the second method will be of the form (char c, int n). */

package Demo;

class tops {
	int n;
	char c;

	tops(int n, char c) {// constructor for int and char
		this.n = n;
		this.c = c;
		System.out.println("Number =    " + n + "\tand  Character = " + c);

	}

	tops(char c, int n) {// constructor for char and int
		this.c = c;
		this.n = n;
		System.out.println("Character = " + c + "\tand  Number =  " + n);

	}
}

public class Q_21_IntAndChar {

	public static void main(String[] args) {
		tops t = new tops(3, 'm');
		tops t1 = new tops('m', 6565);

	}

}
