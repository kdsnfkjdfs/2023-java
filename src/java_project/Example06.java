package java_project;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		
		int a,b;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		a = sc.nextInt();
		System.out.print("�� �Է�: ");
		b = sc.nextInt();
		System.out.print("������ �Է�: ");
		c = sc.next().charAt(0);
//		if(a%2==1)
//			System.out.println(a+"�� Ȧ���Դϴ�");
//		else
//			System.out.println(a+"�� ¦���Դϴ�");
		
		if(c == '+') System.out.println(a+"+"+b+" = "+(a+b));
		else if(c == '-') System.out.println(a+"-"+b+" = "+(a-b));
		else if(c == '*') System.out.println(a+"*"+b+" = "+(a*b));
		else System.out.println(a+"/"+b+" = "+(a/b));
	}

}
