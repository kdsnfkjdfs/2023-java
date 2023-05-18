package s0518;

public class FOOD {
	String name;
	int price = 1000;
	int count; 
	static int total_count;

	// 생성자
	FOOD(){}
	
	FOOD(String name1, int count1){
		name = name1;
		count = count1;
		total_count+=count;
		

	}
	
	//메소드 
	void PrintFood() {
		System.out.println(name + price+ "원 *"+count+"개");
		System.out.println("총 수량:"+total_count);
	}
	
	int GetPrice() {
		return price;
	}
	
	void SetPrice(int price1) {
		price = price1;
		
	}

}
