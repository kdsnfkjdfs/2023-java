package s0601;

public class Cafe {
	private int coffee;
	private int sugar;
	private int cream;
	
	public void maketea(int coffee, int sugar,int cream) {
		this.coffee = coffee;
		this.sugar = sugar;
		this.cream = cream;
		
		System.out.println("��ũĿ�� ������~~");
		System.out.println("Ŀ�ǳ� : "+(coffee+sugar+cream));
		System.out.println();
		printTeaInfo();
	}
	
	public void makeTea(int sugar, int coffee) {
		this.coffee = coffee;
		this.sugar = sugar;
		
		System.out.println("���� Ŀ�� ������~~");
		System.out.println("Ŀ�� �� : "+(coffee+sugar));
		printTeaInfo();
	}
	public void makeTea(int coffee) {
		this.coffee = coffee;
		
		System.out.println("���� Ŀ�� ������~~");
		System.out.println("Ŀ�� �� : "+(coffee));
		printTeaInfo();
	}
	
	void printTeaInfo() {
		System.out.println("----{����}----");
		System.out.println("Ŀ��"+coffee);
		System.out.println("����:"+sugar);
		System.out.println("ũ��"+cream);
		System.out.println("------------");
	}
}
