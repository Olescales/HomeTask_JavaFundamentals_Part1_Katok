package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

//36. ����� ������� ������������ ������ � �������� ���� ��������������� �����.

public class Task36 {

	public static void main(String[] args) {

		int number;
		int recidue;
		int a;
		int mult_even = 1;
		int mult_odd = 1;
		float quotient;

		a = enterNumber("������� �������������� �����: ");

		for (number = a; number > 0; number = number / 10) {
			
			recidue = number % 10;
			if (recidue % 2 == 0) {
				mult_even = mult_even * recidue;
			} else {
				mult_odd = mult_odd * recidue;
			}

		}

		System.out.println("������������ ������ �����:   " + mult_even);
		System.out.println("������������ �������� �����: " + mult_odd);
		
		quotient = (float) mult_even / mult_odd;
		System.out.println("�������: " + quotient);

	}

	public static int enterNumber(String message) {

		int x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			String S;
			S = sc.next();
			System.out.println("�� ����� �� �����: " + S);
			System.out.println("������� �����: ");
		}
		x = sc.nextInt();

		return x;
	}

}
