package isPrime;

import java.util.Scanner;

public class isPrime {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Sayiyi Giriniz : ");
		int number = scan.nextInt();
		boolean isPrime = true;

		if (number < 2) {
			System.out.println("Geçersiz Sayi Girdiniz!");
		} else if (number == 2) {
			System.out.println("Asal Sayidir");
		} else {

			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					isPrime = false;
				}

			}

			if (isPrime) {
				System.out.println("Asal Sayidir");
			} else {
				System.out.println("Asal Sayi Degildir!");
			}
		}
	}

}
