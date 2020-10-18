import java.util.Scanner;


public class friendsNumbers {

		public static void main(String[] args){
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Lütfen 2 Sayi Giriniz : ");
			
			int number1 = scan.nextInt();
			int number2 = scan.nextInt();
			
			int total = 0;
			int total1= 0;
			
			for(int i=1;i<number1;i++){
				
				if(number1 % i == 0){
					
					total+=i;
				}
				
			}
			for(int i=1;i<number1;i++){
				
				if(number2 % i == 0){
					
					total1+=i;
				}
				
			}
			if(total1 == number1 && total == number2){
				System.out.println("Arkadas Sayilardir!");
			}else{
				System.out.println("Arkadas Sayi Degildir!");
			}
			
		}
}
