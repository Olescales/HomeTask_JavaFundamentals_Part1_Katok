package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task31 {

	/*31. —оставить программу дл€ вычислени€ пути, пройденного лодкой, если ее скорость в сто€чей воде v км/ч,
	 *  скорость течени€ реки v1 км/ч, врем€ движени€ по озеру t1 ч, а против течени€ реки Ч t2 ч.*/
	
	public static void main(String[] args) {
		
		double speedA;
		double speedB;
		double timeA;
		double timeB;
		double path;
		
		speedA = enterNumber ("Enter own speed(miles/hour): ");
		speedB = enterNumber ("Enter stream speed(miles/hour): ");
		timeA = enterNumber ("Enter time in lake(hours): ");
		timeB = enterNumber ("Enter time in river(hours): ");
		
		path = (speedA - speedB) * timeB + speedA * timeA;
		
		System.out.println("distance covered(in miles):" + path);
			

	}

	public static double enterNumber(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("¬ы ввели неправильное число: " + S);
			System.out.println("¬ведите число: ");
		}
		x = sc.nextDouble();

		return x;
	}

}
