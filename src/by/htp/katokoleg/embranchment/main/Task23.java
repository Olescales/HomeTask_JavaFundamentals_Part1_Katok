package by.htp.katokoleg.embranchment.main;

/*23. ќпределить правильность даты, введенной с клавиатуры (число Ч от 1 до 31, мес€ц Ч от 1 до 12).
 *  ≈сли введены некорректные данные, то сообщить об этом.*/

public class Task23 {

	public static void main(String[] args) {
		
		int day;
		int month;
		
		day   = (int)(Math.random() * 40);
		month = (int)(Math.random() * 20);
		
		System.out.println("Day: " + day);
		System.out.println("Month: " + month);		
		
		if ((month < 1 || month > 12) && (day < 1 || day > 31))  {
			System.out.println("Incorrect date");
		}
		else if (day < 1) {
			System.out.println("Incorrect day");
		}
		else if (month < 1 || month > 12) {
			System.out.println("Incorrect month");
		}
		else if (day > 31 && month == 1 || 
				 day > 31 && month == 3 || 
				 day > 31 && month == 5 || 
				 day > 31 && month == 7 || 
				 day > 31 && month == 8 || 
				 day > 31 && month == 10 || 
				 day > 31 && month == 12) {
			System.out.println("Incorrect day");
		}
		else if (day > 30 && month == 4 ||
				 day > 30 && month == 6 ||
				 day > 30 && month == 9 ||
				 day > 30 && month == 11) {
			System.out.println("Incorrect day");
		}
		else if (day > 28 && month == 2) {
			System.out.println("Incorrect day");
		}
		else {
			System.out.println("Correct date");
		}
	}

}
