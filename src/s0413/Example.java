package s0413;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		int max=0;
		int i=0;
		int [] num = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		while(i<5) {
			System.out.print(i+1+"���� ���� : ");
			num[i] = sc.nextInt();
			if(max<num[i]) max = num[i];
			
			i+=1;
		}
		
		System.out.println("�Է��� ������ �ִ밪�� "+max+"�Դϴ�");
		
	}

}
