package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task17 {

	//17. ���� ��� �����. ����� ������� �������������� ����� ���� ����� � ������� �������������� ������� ���� �����.
	
	public static void main(String[] args) {
		
		double a;
		double b;
		
		a = enterNumber ("������� �����: ");
		b = enterNumber ("������� �����: ");
		
		double average = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		double geometric_mean = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("������� �������������� = " + average);
		System.out.println("������� �������������� = " + geometric_mean);
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
