package s0413;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		
		String[][] num = new String[2][4];
		float sum = 0;
		char a;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			System.out.print("�л�"+i+"�Է�:");
			num[i][0] = sc.nextLine();
			
			for(int j=1; j < 4;j++) {
				System.out.print("����"+j+"�Է�:");
				num[i][j] = sc.nextLine();
			}
		}
		
		for(int i=0;i<2;i++) {
			
			for(int j=1; j < 4;j++) {
				sum += Double.parseDouble(num[i][j]);
			}
			if(sum/3>=90) a = 'A';
			else if(sum/3>=80) a = 'B';
			else if(sum/3>=70) a = 'C';
			else if(sum/3>=60) a = 'D';
			else a = 'F';
			
			System.out.println(num[i][0]+"�� �л��� ������ "+(int)sum+"�̰� ����� "+sum/3.0+"�Դϴ�");
			System.out.println(num[i][0]+"�� �л��� ������ "+a);
		}
		
		sum = 0;
	}

}
