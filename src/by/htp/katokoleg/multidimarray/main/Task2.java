package by.htp.katokoleg.multidimarray.main;

import java.util.Random;

//2. Создать и вывести на экран матрицу 2 x 3, заполненную случайными числами из [0,9].

public class Task2 {

	public static void main(String[] args) {

		int[][] multArray = new int[2][3];
		
		Random random = new Random();
		
		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				multArray[i][j] = random.nextInt(10);
				System.out.print(multArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
