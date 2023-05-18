package s0413;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		
		String[][] num = new String[2][4];
		float sum = 0;
		char a;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<2;i++) {
			System.out.print("학생"+i+"입력:");
			num[i][0] = sc.nextLine();
			
			for(int j=1; j < 4;j++) {
				System.out.print("성적"+j+"입력:");
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
			
			System.out.println(num[i][0]+"의 학생의 총점은 "+(int)sum+"이고 평균은 "+sum/3.0+"입니다");
			System.out.println(num[i][0]+"의 학생의 학점은 "+a);
		}
		
		sum = 0;
	}

}
