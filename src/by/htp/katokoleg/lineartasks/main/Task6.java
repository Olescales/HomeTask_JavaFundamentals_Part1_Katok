package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task6 {

/*	6. �������� ��� ��� ������� ������. � n ����� ������� 80 � ������. 
 * ������� ������ ������ � m ������� �������,
 *  ���� � ������ ������� ������ �� 12 �. ������, ��� � �����?
*/
	public static void main(String[] args) {
		
		int n;
		int m;
		double v;
		
		n = enterSilable("������� ���������� ����� ������� ������: ");
		m = enterSilable("������� ���������� ������� ������� ������: ");
		
		double prom = (double) 80 / n;
				
		v = (double) m * (prom + 12 );
		
		System.out.println("� ������� ������� " + v + " ������ ������");

	}

	public static int enterSilable(String message) {

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
