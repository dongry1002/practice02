package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int intArray[] = new int[5];
		double sum = 0;

		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		for(int i=0;i<5;i++){
			intArray[i]=scanner.nextInt();
		}
		
		/* 배열에 저장된 정수 값 더하기 */
		for(int i=0;i<5;i++){
			sum+=intArray[i];
		}
		
		for (int i=0;i<5;i++){
			System.out.println(intArray[i]);
		}
		System.out.println("평균은"+sum/5);
		/* 출력 */

		/* 자원정리 */
		scanner.close();
	}
}
