package s0330;

import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		

	}

}
	