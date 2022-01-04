package BackEnd;

import java.util.Scanner;

public class KullaniciGirisi {

	public KullaniciGirisi() {
		// TODO Auto-generated constructor stub
	}
	
	static public void main(String[] args) {
		
		String userName, password;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kullanıcı adınız: ");
		userName = input.nextLine();
		System.out.print("Şifreniz: ");
		password = input.nextLine();
		
		if (userName.equals("Patika") && password.equals("Java123")) {
			System.out.print("Giriş işleminiz başarılı, hoşgeldiniz.");
		} else {
			System.out.print("Başarısız işlem, lütfen tekrar deneyiniz.");
		}
	}

}
