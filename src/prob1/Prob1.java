package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("금액입력>>");
		int money=scanner.nextInt();
		
		int[] pay={50000,10000,5000,1000,500,100,50,10,1};
		
		
		for(int count=0;count<9;count++){
			
			System.out.println(pay[count]+"원권:"+money/pay[count]);
			money=money%pay[count];
						
		}
		
		
		
		
	}
}