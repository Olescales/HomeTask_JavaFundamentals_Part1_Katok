package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task23 {

	//23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r).
	
	public static void main(String[] args) {
		
		double outerradius;
		double innerradius;
		
		double square;
		
		outerradius = enterNumber ("Введите внешний радиус кольца: ");
		innerradius = enterNumber ("Введите внутренний радиус кольца(он должен быть меньше внешнего):  ");
		
		square = Math.PI * (Math.pow(outerradius, 2) - Math.pow(innerradius, 2));
		System.out.println("Площадь кольца равна: " + square);
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
