package s0518;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.setName("��κ�");
		kim.setGrade(2);
		System.out.println("�̸�:"+kim.getName()+"�̰�, "+kim.getGrade()+"�г��Դϴ�.");
		System.out.println("�л���:"+kim.getCount());
		
		Student song = new Student();
		song.setName("�۷κ�");
		song.setGrade(2);
		System.out.println("�̸�:"+song.getName()+"�̰�, "+song.getGrade()+"�г��Դϴ�.");
		System.out.println("�л���:"+song.getCount());
	}

}
