/*W.A.J.P to create a custom exception if Customer withdraw amount which is greater
than account balance then program will show custom exception otherwise amount
will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
2500
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.*/

package Demo;

import java.util.Scanner;

public class Q_40_CustomerException {
	public static void main(String[] args) {
		int AccBalance = 2000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdraw amount:");
		int withdraw = sc.nextInt();
		try {
			if (withdraw > AccBalance) {
				int remains = withdraw - AccBalance;
				throw new ArithmeticException(
						"Sorry insufficient balance plaese need more " + remains + " Rs. To perform this transaction");
			} else {
				int remain = AccBalance - withdraw;
				System.out.println("your transaction  successfully remain  balance is " + remain);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
