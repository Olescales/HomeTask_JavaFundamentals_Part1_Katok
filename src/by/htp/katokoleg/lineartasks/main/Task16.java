package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

//16. ����� ������������ ���� ��������� ��������������� �����.

public class Task16 {

	public static void main(String[] args) {
		
		int product = 1;
		int number;
		int balance;
		int a;
		
		a = enterNumber("������� �������������� �����: ");
				
		for (number = a; number > 0; number = number / 10) {
		balance = number % 10;
		product = product * balance;
		
		}
		System.out.println("���������: " + product);
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
