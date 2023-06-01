package s0601;

public class Car {
	private String name;
	protected String color;
	int velocity;
	
	Car(){
		System.out.println("Car생성자");
	}
	void speedUp() {
		velocity +=5;
		System.out.println("속도 증가"+velocity);
	}
	void speedDown() {
		velocity -= 5;
		System.out.println("속도 감소"+velocity);
	}

	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
}
