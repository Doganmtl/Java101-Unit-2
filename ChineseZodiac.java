package BackEnd;

import java.util.Scanner;

public class ChineseZodiac {

	public ChineseZodiac() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		int yil, kalan;
		String zodiac;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Doğum yılınızı giriniz: ");
		yil = input.nextInt();
		
		kalan = yil % 12;
		
		switch(kalan) {
		
		case 1:
			zodiac = "Maymun";
			break;
		case 2:
			zodiac = "Horoz";
			break;
		case 3:
			zodiac = "Köpek";
			break;
		case 4:
			zodiac = "Domuz";
			break;
		case 5:
			zodiac = "Fare";
			break;
		case 6:
			zodiac = "Öküz";
			break;
		case 7:
			zodiac = "Kaplan";
			break;
		case 8:
			zodiac = "Ejderha";
			break;
		case 9:
			zodiac = "Yılan";
			break;
		case 10:
			zodiac = "At";
			break;
		case 11:
			zodiac = "Koyun";
			break;
		default:
			zodiac = "Hata";
			break;
		}
		
		System.out.print(zodiac);
		
	}

}
