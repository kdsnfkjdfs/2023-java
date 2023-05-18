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
		System.out.println(name + ": �������Դϴ�");
	}
	void Stop() {
		running = false;
		System.out.println(name + ": �����Ͽ����ϴ�");
	}
	
	void vel_up(int value) {
		if(!running) {
			System.out.println(name+"������");
			return;
		}
		velocity += value;
		if(velocity>=100) {
			velocity = 100;
			System.out.println("�ִ� �ӵ� 100�Դϴ�");
		}
		else System.out.println(name+"����ӵ�: "+velocity);
	}	
	
	void vel_down(int value) {
		if(!running) {
			System.out.println(name+"������");
			return;
		}
		velocity -= value;                 6
		System.out.println(name+"����ӵ�: "+velocity);
	}
}
