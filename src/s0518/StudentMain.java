package s0518;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.setName("김로봇");
		kim.setGrade(2);
		System.out.println("이름:"+kim.getName()+"이고, "+kim.getGrade()+"학년입니다.");
		System.out.println("학생수:"+kim.getCount());
		
		Student song = new Student();
		song.setName("송로봇");
		song.setGrade(2);
		System.out.println("이름:"+song.getName()+"이고, "+song.getGrade()+"학년입니다.");
		System.out.println("학생수:"+song.getCount());
	}

}
