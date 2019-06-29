package by.htp.katokoleg.embranchment.main;

import java.util.Scanner;

/*3. Составить программу сравнения введенного числа а и цифры 3.
 *  Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».*/

public class Task3 {

	public static void main(String[] args) {
		double a;
		
		a = enterDouble ("Enter a: ");
		if (a > 3) {
			System.out.println("No");			
		}
		else {
			System.out.println("Yes");
		}

	}
	
	public static double enterDouble(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("Вы ввели неверное число: " + S);
			System.out.println("Введите число: ");
		}
		x = sc.nextDouble();

		return x;
	}
}
