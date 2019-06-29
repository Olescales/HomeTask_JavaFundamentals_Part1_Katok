package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task28 {

	//28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.
	
	public static void main(String[] args) {
		double rad;
		double degree;
		double min;
		double sec;
		
		rad = enterNumber ("Enter value in radians ( <6.28 or 2П ) ");
		
		degree = Math.toDegrees(rad);
		min = degree * 60;
		sec = min * 60;
		System.out.println(rad + " radian = " + degree + " degrees or " + min +" minutes or " + sec + " seconds.");
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
