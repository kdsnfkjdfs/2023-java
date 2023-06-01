package s0601;

public class Cafe {
	private int coffee;
	private int sugar;
	private int cream;
	
	public void maketea(int coffee, int sugar,int cream) {
		this.coffee = coffee;
		this.sugar = sugar;
		this.cream = cream;
		
		System.out.println("밀크커피 나가요~~");
		System.out.println("커피농도 : "+(coffee+sugar+cream));
		System.out.println();
		printTeaInfo();
	}
	
	public void makeTea(int sugar, int coffee) {
		this.coffee = coffee;
		this.sugar = sugar;
		
		System.out.println("설탕 커피 나가요~~");
		System.out.println("커피 농도 : "+(coffee+sugar));
		printTeaInfo();
	}
	public void makeTea(int coffee) {
		this.coffee = coffee;
		
		System.out.println("설탕 커피 나가요~~");
		System.out.println("커피 농도 : "+(coffee));
		printTeaInfo();
	}
	
	void printTeaInfo() {
		System.out.println("----{성분}----");
		System.out.println("커피"+coffee);
		System.out.println("설탕:"+sugar);
		System.out.println("크림"+cream);
		System.out.println("------------");
	}
}
