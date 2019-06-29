package by.htp.katokoleg.multidimarray.main;

/*1. Cоздать матрицу 3 x 4, заполнить ее числами 0 и 1 так, чтобы в одной строке была
ровно одна единица, и вывести на экран.*/

public class Task1 {

	public static void main(String[] args) {

		int[][] multArray = new int[3][4];

		for (int i = 0; i < multArray.length; i++) {
			for (int j = 0; j < multArray[i].length; j++) {
				if (j == 2) {
					multArray[i][j] = 1;
				} else {
					multArray[i][j] = 0;
				}
				System.out.print(multArray[i][j] + " ");
			}
			System.out.println();
		}
	}

}
