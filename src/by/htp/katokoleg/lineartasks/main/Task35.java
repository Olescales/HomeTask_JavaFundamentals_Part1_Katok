package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task35 {

	//35. ���� ����������� ����� � � N. ������� ������� ����� ������� ����� � ������� ����� ����� ����� ����� M/N.
	// ����������� ����� ������ �����.
	
	public static void main(String[] args) {
		
		long x;
		long y;
		
		x = enterNumber (" Enter natural number:");
		
		y = x % 10; 
		
		System.out.println("Result: " + y + "0");

	}

	public static long enterNumber(String message) {

		long x;

		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextLong()) {
			String S;
			S = sc.next();
			System.out.println("�� ����� ������������ �����: " + S);
			System.out.println("������� �����: ");
		}
		x = sc.nextLong();

		return x;
	}
	
}
