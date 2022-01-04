package BackEnd;

import java.util.Scanner;

public class LeapYear {

	public LeapYear() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		int year;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Yılı giriniz: ");
		year = input.nextInt();
		
		if ((year % 4 == 0) && ((year % 100 != 0 || year % 400 == 0))) {
			System.out.print(year +  " bir artık yıldır.");
		} else {
			System.out.print(year + " bir artık yıl değildir.");
		}
		
		
	}

}
