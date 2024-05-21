/*W.A.J.P to find all interleaving of given strings.
The given strings are: WX YZ
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ
 */

package Demo;

public class Q_18_Interleaving {

	public static void main(String[] args) {
		String str1 = "WX";
		String str2 = "YZ";

		System.out.println("The given strings are: " + str1 + " " + str2);
		System.out.println("The interleaved strings are:");
		interleavedStrings("", str1, str2);
	}

	private static void interleavedStrings(String st, String str1, String str2) {
		if (str1.length() == 0 && str2.length() == 0) {
			System.out.println(st);
		}

		if (str1.length() > 0) {
			interleavedStrings(st + str1.charAt(0), str1.substring(1), str2);
		}

		if (str2.length() > 0) {
			interleavedStrings(st + str2.charAt(0), str1, str2.substring(1));
		}

	}

}
