package BackEnd;

import java.util.Scanner;

public class SinifGecme {

	public SinifGecme() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		int matematik, fizik, turkce, kimya, muzik, toplam = 0, count = 0, ortalama;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik notunuzu giriniz: ");
		matematik = input.nextInt();
		System.out.print("Fizik notunuzu giriniz: ");
		fizik = input.nextInt();
		System.out.print("Türkçe notunuzu giriniz: ");
		turkce = input.nextInt();
		System.out.print("Kimya notunuzu giriniz: ");
		kimya = input.nextInt();
		System.out.print("Müzik notunuzu giriniz: ");
		muzik = input.nextInt();
		
		if (0 < matematik || matematik < 100) {
			toplam += matematik;
			count++;
		} if (0 < fizik || fizik < 100) {
			toplam += fizik;
			count++;
		} if (0 < turkce || turkce < 100) {
			toplam += turkce;
			count++;
		} if (0 < kimya || kimya < 100) {
			toplam += kimya;
			count++;
		} if (0 < muzik || muzik < 100) {
			toplam += muzik;
			count++;
		} else {
			System.out.print("Lütfen geçerli değerler giriniz.");
		}
		
		ortalama = toplam / count;
		
		System.out.print((ortalama) >= 55 ? "Geçtiniz, ortalamanız: " + ortalama : "Kaldınız, ortalamanız: " + ortalama);
	}

}
