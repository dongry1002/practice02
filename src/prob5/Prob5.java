package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		
		Random random=new Random();
		int number = random.nextInt(100)+1;
		int a = 0;
		int high=100;
		int low=1;
		int count=1;
		//System.out.println( number);
		Scanner scanner =new Scanner(System.in);
		System.out.println("수를결정하였습니다. 맞추어보세요");
		
		do{
			
			System.out.println(low+"-"+high);
			System.out.print(count+++">>");
			a=scanner.nextInt();
			if(a>number){
				System.out.println("더 낮게");
				high=a;
			
			}else if(a<number){
				System.out.println("더 높게");
				low=a;
			}
		}while(a!=number);
		System.out.println("다시하시겠습니끼?(y/n)>>");
		
			String answer= scanner.next();//객체내용비교는 == 쓰면 안된다 equals를 사용해야해
		
			System.out.println(answer.equals("y"));
		
		
	}
	
}