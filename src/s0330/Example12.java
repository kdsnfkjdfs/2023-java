package s0330;

import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int i =1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է�: ");
		n = sc.nextInt();
		
		while(true) {
			if(n < i) break;
			System.out.print(i+"\t");
			i++;
		}
		
		System.out.println("");		
		System.out.println("____________________________");
		
		for(i=1;i<=10;i++){
			
	
			if(i==n) continue;
			System.out.print(i+"\t");
			
		}
	}

}
