package s0525;

public class Account {
	String name;
	int no,balance;
	
	Account(){
		System.out.println("=====계정 추가=====");
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
		System.out.println("[계좌번호] 에금주"+name+"계좌번호:"+no+"잔고:"+balance);
		
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
		System.out.println("작업을 선택하시오. \n" +"1.입금\n 2.출금 \n 3.잔고조회 \n 4.종료");
	}
}
