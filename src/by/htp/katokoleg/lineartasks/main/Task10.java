package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения): 

public class Task10 {

	public static void main(String[] args) {
		double x;
		double y;
		
		double result;
		
		x = enterSilable("Введите x: "); 
		y = enterSilable("Введите y: ");

		result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.print("Результат: " + result);
		
	}

	public static double enterSilable(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("Вы ввели не число: " + S);
			System.out.println("Введите число: ");
		}
		x = sc.nextDouble();

		return x;
	}
	
}
