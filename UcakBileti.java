package BackEnd;

import java.util.Scanner;

public class UcakBileti {

	public UcakBileti() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		double mesafe, yas, ucret = 0.10, yon, toplamTutar;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Mesafeyi kilometre türünden giriniz: ");
		mesafe = input.nextDouble();
		System.out.print("Yaşınızı giriniz: ");
		yas = input.nextDouble();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
		yon = input.nextDouble();
		
		toplamTutar = mesafe * ucret;
		
		if ((yas > 24 && yas < 65) && (yon == 1)) {
			System.out.print("Toplam tutar: " + toplamTutar + " TL.");
			} else if ((yas > 24 && yas < 65) && (yon == 2)) {
				System.out.print("Toplam tutar: " + (toplamTutar - (toplamTutar * 0.2)) + " TL.");
			} else if ((yas < 12) && (yon == 1)) {
				System.out.print("Toplam tutar: " + ((toplamTutar - (toplamTutar * 0.5)) + " TL."));
			} else if ((yas < 12) && (yon == 2)) {
				System.out.print("Toplam tutar: " + (((toplamTutar - (toplamTutar * 0.5)) - (toplamTutar * 0.2)) + " TL."));
			} else if ((yas >= 12 && yas <= 24) && (yon == 1)) {
				System.out.print("Toplam tutar: " + ((toplamTutar - (toplamTutar * 0.1)) + " TL."));
			} else if ((yas >= 12 && yas <= 24) && (yon == 2)) {
				System.out.print("Toplam tutar: " + ((toplamTutar - (toplamTutar * 0.1) - (toplamTutar * 0.2)) + " TL."));
			} else if (yas > 65 && yon == 1) {
				System.out.print("Toplam tutar: " + (toplamTutar - (toplamTutar * 0.3)) + " TL.");
			} else if (yas > 65 && yon == 2) {
				System.out.print("Toplam tutar: " + (toplamTutar - (toplamTutar * 0.3) - (toplamTutar * 0.2)) + " TL.");
			} else {
				System.out.print("Hatalı veri girdiniz.");
			}
		
		
	}

}
