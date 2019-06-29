package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task17 {

	//17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.
	
	public static void main(String[] args) {
		
		double a;
		double b;
		
		a = enterNumber ("Введите число: ");
		b = enterNumber ("Введите число: ");
		
		double average = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		double geometric_mean = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("Среднее арифметическое = " + average);
		System.out.println("Среднее геометрическое = " + geometric_mean);
	}

	public static int enterNumber(String message) {

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
