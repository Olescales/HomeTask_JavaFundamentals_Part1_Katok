package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

//12. ��������� ���������� ����� ����� ������� � ������� ������������ (�1, �1)� (x2, �2).

public class Task12 {
	
	public static void main(String[] args) {
		
		double x1;
		double y1;
		
		double x2;
		double y2;
		
		double delta_x;
		double delta_y;
		double dist;
		
		
		x1 = enterSilable("������� ���������� � ����� 1: "); 
		y1 = enterSilable("������� ���������� y ����� 1: ");
		
		x2 = enterSilable("������� ���������� x ����� 2: "); 
		y2 = enterSilable("������� ���������� y ����� 2: ");
		
		delta_x = x2 - x1;
		delta_y = y2 - y1;
		
		dist = Math.sqrt(Math.pow(delta_x, 2) + Math.pow(delta_y, 2));
	
		System.out.println("���������� ����� �������: " + dist);
		
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
