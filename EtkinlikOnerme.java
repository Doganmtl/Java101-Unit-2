package BackEnd;

import java.util.Scanner;

public class EtkinlikOnerme {

	public EtkinlikOnerme() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		int sicaklik;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen sıcaklık değerini giriniz: ");
		sicaklik = input.nextInt();
		
		if (sicaklik < 5) {
			System.out.print("Kayak.");
		} else if (sicaklik <= 25) {
			if (sicaklik >= 5 && sicaklik <= 15) {
				System.out.println("Sinema.");
			} 
			if (sicaklik >= 15 && sicaklik <= 25) {
				System.out.println("Piknik.");
			}
		} else {
			System.out.print("Yüzme.");
		}
		
	}

}
