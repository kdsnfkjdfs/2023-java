package s0413;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���Է� : ");
		m = sc.nextInt();
		
		switch(m) {
		case 2:
			System.out.println("2���� 28���Դϴ�");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(m + "���� 30���Դϴ�");
			break;
		default:
			System.out.println(m + "���� 31���Դϴ�");
		}
	}

}
