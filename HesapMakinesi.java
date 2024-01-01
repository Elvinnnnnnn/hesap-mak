package hesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. Sayıyı Giriniz : ");
		
		double sayi1 = scanner.nextDouble();
		
		System.out.print("2. Sayıyı Giriniz : ");
		
		double sayi2 = scanner.nextDouble();
		
		System.out.println("Yapmak İstediğiniz İşlemi Seçiniz : 1-Toplama  2-Çıkarma  3-Çarpma  4-Bölme ");
		
		int islem = scanner.nextInt(); 
		
		double sonuc = 0;

		
		switch (islem) {
		
		case 1: 
			sonuc = sayi1+sayi2;
			break;
			
		case 2:	
			sonuc = sayi1-sayi2;
			break;
			
		case 3:
			sonuc = sayi1*sayi2;
			break;
		
		case 4:
			sonuc = sayi1/sayi2;
			break;
			
		}
		
		System.out.print("Sonuç : " + sonuc);
		
		
		
		
		
		
		}
		
		
}
		

