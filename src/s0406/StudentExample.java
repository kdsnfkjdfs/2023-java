package s0406;

public class StudentExample {

	public static void main(String[] args) {
		Student kim = new Student();
		Student lee = new Student();
		
		kim.name = "������";
		kim.number = 10110;
		kim.phone = "010-5016-7023";
		kim.School = "���쿺�����б�";

		System.out.println("�̸�:"+kim.name);
		System.out.println("�й�"+kim.number);
		System.out.println("��ȭ:"+kim.phone);
		System.out.println("�б�:"+kim.School);
		lee.name = "��";
		lee.number = 230110;
		lee.phone = "010-5496-7233";		

		
		System.out.println("�̸�:"+lee.name);
		System.out.println("�й�"+lee.number);
		System.out.println("��ȭ:"+lee.phone);	
		System.out.println("�б�:"+lee.School);
		
		System.out.println("���л���:"+Student.count);
	}
}
