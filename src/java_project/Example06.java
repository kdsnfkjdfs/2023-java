package java_project;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		
		int a,b;
		char c;
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력: ");
		a = sc.nextInt();
		System.out.print("수 입력: ");
		b = sc.nextInt();
		System.out.print("연산자 입력: ");
		c = sc.next().charAt(0);
//		if(a%2==1)
//			System.out.println(a+"은 홀수입니다");
//		else
//			System.out.println(a+"은 짝수입니다");
		
		if(c == '+') System.out.println(a+"+"+b+" = "+(a+b));
		else if(c == '-') System.out.println(a+"-"+b+" = "+(a-b));
		else if(c == '*') System.out.println(a+"*"+b+" = "+(a*b));
		else System.out.println(a+"/"+b+" = "+(a/b));
	}

}
