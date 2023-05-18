package s0406;

public class StudentExample {

	public static void main(String[] args) {
		Student kim = new Student();
		Student lee = new Student();
		
		kim.name = "이정현";
		kim.number = 10110;
		kim.phone = "010-5016-7023";
		kim.School = "응우옌교육학교";

		System.out.println("이름:"+kim.name);
		System.out.println("학번"+kim.number);
		System.out.println("전화:"+kim.phone);
		System.out.println("학교:"+kim.School);
		lee.name = "현";
		lee.number = 230110;
		lee.phone = "010-5496-7233";		

		
		System.out.println("이름:"+lee.name);
		System.out.println("학번"+lee.number);
		System.out.println("전화:"+lee.phone);	
		System.out.println("학교:"+lee.School);
		
		System.out.println("총학생수:"+Student.count);
	}
}
