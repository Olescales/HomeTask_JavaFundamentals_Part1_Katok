package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task21 {

	/*21. ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������).
	 *  �������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����. */

	public static void main(String[] args) {
		
		double R;
		 
		R = enterNumber ("������� ����� ���� nnn.ddd");
		
		System.out.println("�� ����� �����: "+ R);
		
		int integer_part = (int) R;
				
		double fractional_part= R - integer_part;
		
		double y = fractional_part * 1000;
		y = Math.round(y);
		
		double x = (double) integer_part / 1000;
		
		double finish_digital = x + y;
		System.out.println("����� ��������: " + finish_digital);
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
