package BackEnd;

import java.util.Scanner;

public class HesapMakinesi {

	public HesapMakinesi() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		int n1, n2, select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen bir rakam giriniz: ");
		n1 = input.nextInt();
		System.out.print("Lütfen bir rakam daha giriniz: ");
		n2 = input.nextInt();
		System.out.println("Yapabileceğiniz işlemler:\n1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
		System.out.print("Lütfen işlem seçiminizi yapınız: ");
		select = input.nextInt();
		
		if (n2 == 0) {
			System.out.print("Bir sayı sıfıra bölünemez.");
		} 
		
		switch(select) {
		
		case 1:
			System.out.print(n1 + n2);
			break;
		case 2:
			System.out.print(n1 - n2);
			break;
		case 3:
			System.out.print(n1 * n2);
			break;
		case 4:
			System.out.print(n1 / n2);
			break;
		default:
			System.out.print("Lütfen geçerli bir işlem giriniz.");
			break;
		}
		
		
	}

}
