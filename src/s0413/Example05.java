package s0413;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t;
		int sum=0;
		System.out.print("숫자입력:");
		t = sc.nextInt();
		
		
		
		for(int i=1;i<=t;i++) {
			if((i%2)==1) {
				sum += i;
				System.out.print("+"+i);
			}
			else {
				System.out.print("-"+i);
				sum-=i;
			}
			
		}
		System.out.println("="+sum);

	}

}
