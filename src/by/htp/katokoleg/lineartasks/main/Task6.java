package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task6 {

/*	6. Написать код для решения задачи. В n малых бидонах 80 л молока. 
 * Сколько литров молока в m больших бидонах,
 *  если в каждом большом бидоне на 12 л. больше, чем в малом?
*/
	public static void main(String[] args) {
		
		int n;
		int m;
		double v;
		
		n = enterSilable("Введите количество малых бидонов молока: ");
		m = enterSilable("Введите количество больших бидонов молока: ");
		
		double prom = (double) 80 / n;
				
		v = (double) m * (prom + 12 );
		
		System.out.println("В больших бидонах " + v + " литров молока");

	}

	public static int enterSilable(String message) {

		int x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			String S;
			S = sc.next();
			System.out.println("Вы ввели не число: " + S);
			System.out.println("Введите число: ");
		}
		x = sc.nextInt();

		return x;
	}
}
