public class HelloNumbers{
	public static void main(String[] args) {
		for (int i = 0, sum = 0; i <= 9; i++) {
			for (int j = 0; j <= i; j++) {
				sum += j;
			}
			System.out.print(sum + " ");
			sum = 0;
		}
		System.out.println();
	}
}

