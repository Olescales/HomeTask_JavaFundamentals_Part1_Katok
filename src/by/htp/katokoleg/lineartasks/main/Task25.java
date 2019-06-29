package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task25 {

	/*25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с
	 *  (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).*/
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double x1;
		double x2;
		
		a = enterNumber ("Введите а: ");
		b = enterNumber ("Введите b: ");
		c = enterNumber ("Введите c: ");
		
		double descriminant;
		descriminant = Math.pow(b, 2) - (4 * a * c);
		
		if (descriminant == 0) {
			x1 = x2 = - (b / 2 * a);
			System.out.println("Корни уравнения равны: ");
			System.out.println("x1 = x2 = " + x1);
		}
		
		if (descriminant > 0) {
			x1 =  ( -b + Math.sqrt(descriminant)) / ( 2 * a );
			x2 =  ( b + Math.sqrt(descriminant)) / ( 2 * a );
			System.out.println("Корни уравнения равны: ");
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		if (descriminant < 0) {
		System.out.println("Descriminant < 0 . Try again");
		}
	}

	public static double enterNumber(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("Вы ввели неправильное число: " + S);
			System.out.println("Введите число: ");
		}
		x = sc.nextDouble();

		return x;
	}
}
