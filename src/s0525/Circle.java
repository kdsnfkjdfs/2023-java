package s0525;

public class Circle {
	double radius;
	final double PI = 3.14;
	
	Circle(){}
	
	Circle(double radius){
		this.radius= radius;
	}
		

	double getRadius() {
		return radius;
	}
	void setRadius(double radius) {
		this.radius= radius;
	}
	double computeArea() {
		return radius*radius*PI;
	}
	double computeperimeter() {
		return 2*PI*radius;
	}
	
	void Print() {
		System.out.println("반지름:"+ getRadius()+"의 면적은"+computeArea()+"둘레는: "+computeperimeter());
	}
}
