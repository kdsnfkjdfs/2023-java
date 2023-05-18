package s0413;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("달입력 : ");
		m = sc.nextInt();
		
		switch(m) {
		case 2:
			System.out.println("2월은 28일입니다");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(m + "월은 30일입니다");
			break;
		default:
			System.out.println(m + "월은 31일입니다");
		}
	}

}
