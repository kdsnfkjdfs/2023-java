package s0518;

public class FoodMain {

	// ��� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		FOOD dount = new FOOD();
//		dount.name = "ũ������ ����";
//		dount.count = 10;
//		dount.PrintFood();
		
		FOOD juice = new FOOD("������ �꽺",10);
		juice. PrintFood();
		
		FOOD coffee = new FOOD("Ŀ��",5);
		coffee. PrintFood();
		coffee.SetPrice(20000);
		int ���� = coffee.GetPrice();
		System.out.println("����:"+����);
		
	}
}
