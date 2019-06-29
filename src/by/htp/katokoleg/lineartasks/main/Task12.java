package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

//12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2).

public class Task12 {
	
	public static void main(String[] args) {
		
		double x1;
		double y1;
		
		double x2;
		double y2;
		
		double delta_x;
		double delta_y;
		double dist;
		
		
		x1 = enterSilable("Введите координату х точки 1: "); 
		y1 = enterSilable("Введите координату y точки 1: ");
		
		x2 = enterSilable("Введите координату x точки 2: "); 
		y2 = enterSilable("Введите координату y точки 2: ");
		
		delta_x = x2 - x1;
		delta_y = y2 - y1;
		
		dist = Math.sqrt(Math.pow(delta_x, 2) + Math.pow(delta_y, 2));
	
		System.out.println("Расстояние между точками: " + dist);
		
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
