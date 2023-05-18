package s0406;

public class Car {
	String name;
	int price;
	String brand;
	static int count = 0;
	int velocity = 0;
	boolean running = false;
	
	Car(){
		count++;
	}
	
	void Run() {
		running = true;
		System.out.println(name + ": 운행중입니다");
	}
	void Stop() {
		running = false;
		System.out.println(name + ": 정차하였습니다");
	}
	
	void vel_up(int value) {
		if(!running) {
			System.out.println(name+"정차중");
			return;
		}
		velocity += value;
		if(velocity>=100) {
			velocity = 100;
			System.out.println("최대 속도 100입니다");
		}
		else System.out.println(name+"현재속도: "+velocity);
	}	
	
	void vel_down(int value) {
		if(!running) {
			System.out.println(name+"정차중");
			return;
		}
		velocity -= value;                 6
		System.out.println(name+"현재속도: "+velocity);
	}
}
