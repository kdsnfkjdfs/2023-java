package s0518;

public class FOOD {
	String name;
	int price = 1000;
	int count; 
	static int total_count;

	// ������
	FOOD(){}
	
	FOOD(String name1, int count1){
		name = name1;
		count = count1;
		total_count+=count;
		

	}
	
	//�޼ҵ� 
	void PrintFood() {
		System.out.println(name + price+ "�� *"+count+"��");
		System.out.println("�� ����:"+total_count);
	}
	
	int GetPrice() {
		return price;
	}
	
	void SetPrice(int price1) {
		price = price1;
		
	}

}
