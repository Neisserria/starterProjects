package magnificentNumbers;

import java.util.Scanner;

public class MagnificentNumberrs {

		public static void main(String[] args){
			
			Scanner scan = new Scanner(System.in);
			System.out.println("L�tfen Bir Sayi Giriniz : ");
			int number = scan.nextInt();
			int total = 0;
			
			for(int i=1;i<number;i++){
				
				
				
				if(number % i == 0){
					total = total + i;
					
				}
				
			}if(total == number){
				System.out.println("M�kemmel Sayidir!");
			}else{
				System.out.println("M�kemmem Sayi Degildir!");
			}
			
		}
}
