package s0406;

public class Student {
	String name;
	int number;
	String phone;
	static String School = "서울로봇고등학교";
	static int count = 0;
	Student(){
		System.out.println("생성자:"+count);
		count++;
	}
	
}
