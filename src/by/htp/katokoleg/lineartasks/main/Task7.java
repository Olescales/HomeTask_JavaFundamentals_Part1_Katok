package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task7 {

//7. ��� �������������, ������ �������� � ��� ���� ������ �����. ����� ������� ��������������	
	
	public static void main(String[] args) {
		
		double width;
		double length;
		
		double square;
		
		width = enterSilable("������� ������ ��������������: ");
		
		length = 2 * width;		
		
		square = length * width;
		
		System.out.println("������� :" + square);

	}
	public static double enterSilable(String message) {

		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			String S;
			S = sc.next();
			System.out.println("�� ����� �� �����: " + S);
			System.out.println("������� �����: ");
		}
		x = sc.nextDouble();

		return x;
	}
}
