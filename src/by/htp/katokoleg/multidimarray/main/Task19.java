package by.htp.katokoleg.multidimarray.main;

import java.util.Random;

//19. ������������ ���������� ������� ������� n �� ��������� �������(n - ������):

public class Task19 {

	public static void main(String[] args) {
		
		int n;

		Random random = new Random();

		n = random.nextInt(10/2) * 2;

		System.out.println("number of strings: " + n);
		System.out.println("number of elements in string: " + n);

		int[][] multArray = new int[n][n];

		
		int number = 1;
		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				if (i == (number - 1) && j <= n - 1 -i) {
					multArray[i][j] = number;
				} else {
					multArray[i][j] = 0;
				}
				System.out.printf("[%4d]", multArray[i][j]);
			}
			number++;
			System.out.println();
		}
	}

}
