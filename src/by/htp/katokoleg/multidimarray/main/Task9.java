package by.htp.katokoleg.multidimarray.main;

import java.util.Random;

//9. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class Task9 {

	public static void main(String[] args) {
		
		int n;

		Random random = new Random();

		n = random.nextInt(10);

		System.out.println("number of string: " + n);
		System.out.println("number of elements in string: " + n);

		int[][] multArray = new int[n][n];

		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				multArray[i][j] = random.nextInt(10);
				System.out.printf("[%4d]", multArray[i][j]);
			}
			System.out.println();
		}
		
		
		int i = 0;
		int j = 0;
		while (i<n) {
		System.out.println(multArray[i][j]);
		i++;
		j++;
		}
		
	}

}
