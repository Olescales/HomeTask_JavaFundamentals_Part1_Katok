package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task21 {

	/*21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
	 *  Поменять местами дробную и целую части числа и вывести полученное значение числа. */

	public static void main(String[] args) {
		
		double R;
		 
		R = enterNumber ("Введите число вида nnn.ddd");
		
		System.out.println("Вы ввели число: "+ R);
		
		int integer_part = (int) R;
				
		double fractional_part= R - integer_part;
		
		double y = fractional_part * 1000;
		y = Math.round(y);
		
		double x = (double) integer_part / 1000;
		
		double finish_digital = x + y;
		System.out.println("Число наоборот: " + finish_digital);
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
