package basicATM;

import java.util.Scanner;

public class basicATM {
	public static void main(String[] args) {

		int x = 1;

		while (x < 10) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Lütfen Yapicaginiz Islemi Seçin"
					+ "\n1.Toplama" + "\n2.Çikarma" + "\n3.Çarpma"
					+ "\n4.Bölme");
			int select = scan.nextInt();

			switch (select) {

			case 1:
				System.out.println("Lütfen 2 Sayi Giriniz");
				int number1 = scan.nextInt();
				int number2 = scan.nextInt();
				int total = number1 + number2;
				System.out.println("Sonuç : " + total);
				break;
			case 2:
				System.out.println("Lütfen 2 Sayi Giriniz");
				int number3 = scan.nextInt();
				int number4 = scan.nextInt();
				int total2 = number3 - number4;
				System.out.println("Sonuç : " + Math.abs(total2));
				break;
			case 3:
				System.out.println("Lütfen 2 Sayi Giriniz");
				int number5 = scan.nextInt();
				int number6 = scan.nextInt();
				int total3 = number5 * number6;
				System.out.println("Sonuç : " + total3);
				break;
			case 4:
				System.out.println("Lütfen 2 Sayi Giriniz");
				int number7 = scan.nextInt();
				int number8 = scan.nextInt();
				double total4 = number7 / number8;
				System.out.println("Sonuç : " + total4);
				break;
			default:
				System.out.println("Lütfen Geçerli Bir Sayi Giriniz...");
				break;
			}
			System.out.println("Baska bir islem yapmak istermisiniz ?"
					+ "\n1.Evet" + "\n2.Hayır");
			int option = scan.nextInt();

			if (option == 1) {

				continue;

			} else if (option == 2) {

				System.out.println("Bizi Sectiginiz Icin Tesekkürler...3");
				break;

			} else {

				System.out.println("Lütfen Bir Secim Yapiniz.");

			}
		}

	}
}
