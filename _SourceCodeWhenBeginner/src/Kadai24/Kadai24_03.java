package Kadai24;

import java.util.ArrayList;
import java.util.List;

public class Kadai24_03 {

	public static void main(String[] args) {
		List<Integer> square = new ArrayList<>();
		{
			int num = 0;
			while (num * num <= 900) {
				square.add(num * num);
				num++;
			}
		}

		square.forEach(n -> System.out.println(n));
	}

}
