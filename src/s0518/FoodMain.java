package s0518;

public class FoodMain {

	// 멤버 변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		FOOD dount = new FOOD();
//		dount.name = "크리스피 도넛";
//		dount.count = 10;
//		dount.PrintFood();
		
		FOOD juice = new FOOD("오렌지 쥬스",10);
		juice. PrintFood();
		
		FOOD coffee = new FOOD("커피",5);
		coffee. PrintFood();
		coffee.SetPrice(20000);
		int 가격 = coffee.GetPrice();
		System.out.println("가격:"+가격);
		
	}
}
