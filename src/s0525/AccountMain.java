package s0525;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("이정현",456789,10000);
		a1.printInfo();
		Scanner sc = new Scanner(System.in);
		int money;
		
		
		while(true) {
			a1.printMenu();
			int menu = sc.nextInt();
			if(menu == 4) {
				System.out.println("응용해 주셔서 감사합니다.");
				break;
			}
			else if(menu == 1) {
				System.out.print("입금할 금액:");
				money = sc.nextInt();
				a1.inputMoney(money);
				
			}
			else if(menu == 2) {
				System.out.print("출금할 금액:");
				money = sc.nextInt();
				a1.outputMoney(money);
			}
			else if(menu == 3) {
				a1.printInfo();
			}
			else {
				System.out.println("다시 입력해주세요.");
			}
			
		}
		
	}
	
}
