package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

/*ƒл€ данных областей составить линейную программу, котора€ печатает true,
 *  если точка с координатами (х, у) принадлежит закрашенной области,
 *   и false Ч в противном случае:*/

public class Task38 {

	static boolean result = true;

	public static void main(String[] args) {

		firstGraph();
		secondGraph();
		thirdGraph();
		
	}

	public static void thirdGraph() {

		double x;
		double y;

		x = enterDouble("Enter x: ");
		y = enterDouble("Enter y: ");

		if (y >= 0 && x >= 0 && Math.hypot(x, y)<=4 || y <= 0 && x >= 0 && Math.hypot(x, y)<=5) {
			System.out.println(result);
		} else {
			System.out.println(!result);
		}

	}
	
	public static void secondGraph() {

		double x;
		double y;

		x = enterDouble("Enter x: ");
		y = enterDouble("Enter y: ");

		if (y >= 0 && y <= 4 && x <= 2 && x >= -2 || y >= -3 && y < 0 && x <= 4 && x >= (-4)) {
			System.out.println(result);
		} else {
			System.out.println(!result);
		}

	}
	
	public static void firstGraph() {

		double x;
		double y;

		x = enterDouble("Enter x: ");
		y = enterDouble("Enter y: ");

		if (y >= 0 && (Math.abs(x) + y <= 4)) {
			System.out.println(result);
		} else {
			System.out.println(!result);
		}

	}

	public static double enterDouble(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("¬ы ввели не число: " + S);
			System.out.println("¬ведите число: ");
		}
		x = sc.nextDouble();

		return x;
	}

}
