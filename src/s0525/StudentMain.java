package s0525;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim = new Student();
		kim.name = "��κ�";
		kim.grade = 1;
		
		Student lee = new Student(" �̷κ�");
		lee.grade = 2;
		Student park = new Student("�ڷκ�",3);
		
		kim.print();
		lee.print();
		park.print();
	}

}
