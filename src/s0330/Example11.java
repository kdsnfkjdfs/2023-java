package s0330;

import java.util.Scanner;

public class Example11 {

	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¼ö ÀÔ·Â: ");
		n = sc.nextInt();
		
		for(int i = n;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*"+"\t");
				
			}
			System.out.println();
		}
		
	}
	
}
