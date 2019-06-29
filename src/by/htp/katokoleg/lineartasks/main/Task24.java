package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task24 {

	// 24. ����� ������� �������������� �������� � ����������� � � b � ����� a ���
	// ������� ��������� �.

	public static void main(String[] args) {
		
		double a;
		double b;


		double katet;
		double height;
		double square;

		a = enterNumber("������� ������� ��������� ��������: ");
		b = enterNumber("������� ������� ��������� ��������: ");

		double angle = 44;
		
		while (angle < 45 || angle > 90) {

			angle = enterAngle("Enter correct angle (from 46 to 89 degrees): ");
			if (angle > 45 && angle < 90) {
				break;
			}
		}

		katet = (a - b) / 2;

		double angleInRadians = Math.tan(Math.toRadians(angle));

		height = katet * angleInRadians;

		System.out.println("���� � ��������: " + angleInRadians);
		square = ((a + b) / 2) * height;
		System.out.println("������� ��������: " + square);
	}

	public static double enterAngle(String message) {

		double angle;
		char b = '\u00B0'; // ��� ������ ������� 
	

		Scanner sc = new Scanner(System.in);
		System.out.print(message);

		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("�� ����� ������������ ����: " + S + " " + b);
			System.out.println("������� ���������� ����: ");
		}
		angle = sc.nextDouble();
		return angle;
	}

	public static double enterNumber(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("�� ����� ������������ �����: " + S);
			System.out.println("������� �����: ");
		}
		x = sc.nextDouble();

		return x;
	}

}
