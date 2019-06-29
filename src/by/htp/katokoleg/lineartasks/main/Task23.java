package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task23 {

	//23. ����� ������� ������, ���������� ������ �������� ����� r, � ������� � R (R> r).
	
	public static void main(String[] args) {
		
		double outerradius;
		double innerradius;
		
		double square;
		
		outerradius = enterNumber ("������� ������� ������ ������: ");
		innerradius = enterNumber ("������� ���������� ������ ������(�� ������ ���� ������ ��������):  ");
		
		square = Math.PI * (Math.pow(outerradius, 2) - Math.pow(innerradius, 2));
		System.out.println("������� ������ �����: " + square);
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
