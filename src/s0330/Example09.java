package s0330;

import java.util.Scanner;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int even = 0,odd = 0;
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է�: ");
		n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(i%2==0) even += i;
			else odd += i;
		}
		
		
		System.out.println("1����"+n+"������ ¦���� ����"+even+"Ȧ���� ���� "+odd+"�Դϴ�");
		
	}
}