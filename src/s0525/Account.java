package s0525;

public class Account {
	String name;
	int no,balance;
	
	Account(){
		System.out.println("=====���� �߰�=====");
	}
	Account(String name,int no){
		this();
		this. name = name;
		this.no = no;
	}
	Account(String name,int no,int balance){
		this(name,no);
		this. balance = balance;
	}
	
	void printInfo() {
		System.out.println("[���¹�ȣ] ������"+name+"���¹�ȣ:"+no+"�ܰ�:"+balance);
		
	}
	void inputMoney(int Money) {
		balance +=Money;
		printInfo();
	}
	void outputMoney(int money) {
		balance -= money;
		printInfo();
	}
	void printMenu() {
		System.out.println("�۾��� �����Ͻÿ�. \n" +"1.�Ա�\n 2.��� \n 3.�ܰ���ȸ \n 4.����");
	}
}
