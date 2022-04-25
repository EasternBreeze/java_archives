package Kadai24;

import java.util.ArrayList;
import java.util.List;

public class Kadai24_04 {
	static int loop = 0;

	public static void main(String[] args) {
		List<Integer> square = new ArrayList<>();
		{
			int num = 0;
			while (num * num <= 900) {
				square.add(num * num);
				num++;
			}
		}

		for (int i = 1; i <= 1000; i++) {
			squareNumber(square, i);
		}
	}

	private static void squareNumber(List<Integer> square, int n) {
		for (int n1 : square) {
			for (int n2 : square) {
				for (int n3 : square) {
				for (int n4 : square) {
					loop++;
						if (n == n1 + n2 + n3 + n4) {
							String str = "%7d %4d = %3d + %3d + %3d + %3d\n";
							System.out.printf(str, loop, n, n1, n2, n3, n4);
							return;
						} else if (n < n1 + n2 + n3 + n4) {
							break;
						}
					}
				}
			}
		}
	}

}
