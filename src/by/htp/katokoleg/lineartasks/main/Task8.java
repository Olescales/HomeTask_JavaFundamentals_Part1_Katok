package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task8 {

//8. ��������� �������� ��������� �� ������� (��� ���������� ��������� �������������� ��������):
	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		double result;		
		
		
		a = enterSilable("������� a: "); 
		b = enterSilable("������� b: ");
		c = enterSilable("������� c: ");
		
		double root = Math.pow(b , 2)+ (4 * a * c);
		
		result = (b + Math.sqrt(root)) / (2 * a) - (Math.pow(a, 3) * c) + (1 / Math.pow(b, 2));
		System.out.print("���������: " + result);
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
