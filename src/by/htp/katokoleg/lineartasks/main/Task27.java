package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task27 {

	/*27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения,
	 *  получить значение а8 за три операции и а10 за четыре операции.*/
	
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		
		double result1;
		double result2;
		
		a = enterNumber("Enter a:");
		b = a * a ; 
		c = b * b ;
		result1 = c * c;
		System.out.println("a in 8 degree = " + result1);
		
		result2 = result1 * b;
		System.out.println("a in 10 degree = " + result2);
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
