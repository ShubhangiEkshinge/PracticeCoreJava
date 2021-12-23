package iterationstatement;

public class Usingwhile2 {

	public static void main(String[] args) {
		int i = 0;// starting point
		while (i <= 100) {
			if (i % 2 == 0) { //ending point
				System.out.println("even no are:" + i);
			}
			i++;
		}

	}
}
