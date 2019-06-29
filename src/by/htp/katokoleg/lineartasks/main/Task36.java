package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

//36. Найти частное произведений четных и нечетных цифр четырехзначного числа.

public class Task36 {

	public static void main(String[] args) {

		int number;
		int recidue;
		int a;
		int mult_even = 1;
		int mult_odd = 1;
		float quotient;

		a = enterNumber("Введите четырехзначное число: ");

		for (number = a; number > 0; number = number / 10) {
			
			recidue = number % 10;
			if (recidue % 2 == 0) {
				mult_even = mult_even * recidue;
			} else {
				mult_odd = mult_odd * recidue;
			}

		}

		System.out.println("Произведение четных чисел:   " + mult_even);
		System.out.println("Произведение нечетных чисел: " + mult_odd);
		
		quotient = (float) mult_even / mult_odd;
		System.out.println("Частное: " + quotient);

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
