package s0601;

public class EngHello extends Greeting {
	public String name="Mr.hong";
	
	void sayHello() {
		System.out.println(name+"Nice meet you~~");
	}
	void �ȳ��ϼ���() {
		super.sayHello();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.�ȳ��ϼ���();
		
	}

}
