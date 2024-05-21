
public class BubbleSort{
	public static void star(String app[]) {
		for (int i = 0; i < app.length; i++) {
			System.out.print(app[i] + " ");
		}

		System.out.println(" ");
	}

	public static void array(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int arr[] = { 10, 90, 6, 75, 1, 8, 4 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
		array(arr);
		System.out.println("\n\n\n\n\n");
		String app[] = { "jay", "bhavesh", "zoya", "money", "amit", "tejaz" };

		for (int i = 0; i < app.length; i++) {
			for (int j = 0; j < app.length - 1 - i; j++) {
				String te;
				if (app[j].compareTo(app[j + 1]) > 0) {
					te = app[j];
					app[j] = app[j + 1];
					app[j + 1] = te;
				}
			}
		}
		star(app);
	}
}
