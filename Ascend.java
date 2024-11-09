// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);

		int a = (int) Math.floor(Math.random() * lim);
		int b = (int) Math.floor(Math.random() * lim);
		int c = (int) Math.floor(Math.random() * lim);

		System.out.println(a + " " + b + " " + c);

		int min = Math.min(Math.min(a, b), Math.min(b, c));
		int max = Math.max(Math.max(a, b), Math.max(b, c));
		int middle = a + b + c - min - max;

		System.out.println(min + " " + middle + " " + max);

	}
}
