package s0406;

public class CarEample {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Car redCar = new Car();
		Car blueCar = new Car();
	
		redCar.name = "제네시스";
		redCar.price = 5000;
		redCar.brand = "현대";
		redCar.velocity = 30;
		
		blueCar.name = "510D";
		blueCar.price = 8000;
		blueCar.brand = "BMW";
		blueCar.velocity = 40;
		
		redCar.Run();
		redCar.vel_up(10);
		redCar.vel_up(20);
		redCar.vel_down(40);
		redCar.vel_up(50);
		redCar.Stop();

	}

}
