package ryan;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.sort();
	}

	private void sort() {
		int[] Numbers = {5, 8, 2, 6, 1, 3};
		Arrays.sort(Numbers);
		for(int i=0; i<Numbers.length; i++) {
			System.out.println(Numbers[i]);
		}
	}

}
