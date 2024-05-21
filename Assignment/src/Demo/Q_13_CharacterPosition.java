/*W.A.J.P to get the character at the given index within the String. Original String =
Tops Technologies! The character at position 0 is T, The character at position 10 is
o */

package Demo;

public class Q_13_CharacterPosition {

	public static void main(String[] args) {

		String str = "Tops Technologies!";
		// Print the original string.
		System.out.println("Original String = " + str);

		// Get the character at positions 0 and 10.
		int i = str.charAt(0);
		int i1 = str.charAt(10);

		// Print out the results.
		System.out.println("The character at position 0 is " + (char) i); // Print the character at position 0

		System.out.println("The character at position 10 is " + (char) i1); // Print the character at position 10

	}
}
