package by.htp.katokoleg.lineartasks.main;

import java.util.Scanner;

public class Task22 {

	/*22. ���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������.
	 *  ������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����: ��� ����� SSc.*/
	
	public static void main(String[] args) {
		
		int time_in_sec;
		
		time_in_sec = enterNumber("������� ������c��� ������: ");
		
		int sec = time_in_sec % 60;
				
		int time_in_min = (time_in_sec - sec) / 60;
		
		int min = time_in_min % 60;
		
		int hours = (time_in_min - min) / 60;
		System.out.print(hours + "� " + min + "��� " + sec + "�.");
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
