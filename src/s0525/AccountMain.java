package s0525;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account("������",456789,10000);
		a1.printInfo();
		Scanner sc = new Scanner(System.in);
		int money;
		
		
		while(true) {
			a1.printMenu();
			int menu = sc.nextInt();
			if(menu == 4) {
				System.out.println("������ �ּż� �����մϴ�.");
				break;
			}
			else if(menu == 1) {
				System.out.print("�Ա��� �ݾ�:");
				money = sc.nextInt();
				a1.inputMoney(money);
				
			}
			else if(menu == 2) {
				System.out.print("����� �ݾ�:");
				money = sc.nextInt();
				a1.outputMoney(money);
			}
			else if(menu == 3) {
				a1.printInfo();
			}
			else {
				System.out.println("�ٽ� �Է����ּ���.");
			}
			
		}
		
	}
	
}
