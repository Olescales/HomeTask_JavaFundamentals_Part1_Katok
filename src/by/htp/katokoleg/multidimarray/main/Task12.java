package by.htp.katokoleg.multidimarray.main;

import java.util.Random;

//12. �������� ���������� ������� ������� n:

public class Task12 {

	public static void main(String[] args) {

		int n;

		Random random = new Random();

		n = random.nextInt(10) + 5;

		System.out.println("number of strings: " + n);
		System.out.println("number of elements in string: " + n);

		int[][] multArray = new int[n][n];

		int number = 1;
		
		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				if (i == j) {
					multArray[i][j] = number;
					number++;
				} else {
					multArray[i][j] = 0;
				}
				System.out.printf("[%4d]", multArray[i][j]);
			}
			System.out.println();
		}

	}

}
