package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task7 {

//7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника	
	
	public static void main(String[] args) {
		
		double width;
		double length;
		
		double square;
		
		width = enterSilable("Введите ширину прямоугольника: ");
		
		length = 2 * width;		
		
		square = length * width;
		
		System.out.println("Площадь :" + square);

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
