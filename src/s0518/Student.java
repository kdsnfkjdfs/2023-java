package s0518;

public class Student {
	private String name;
	private int grade;
	static int count;
	
	Student(){
		count++;
	}
	static int getCount() {
		return count;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getGrade() {
		return grade;
	}
	void setGrade(int grade) {
		this.grade = grade;
		
	}
	
	void Print() {
		System.out.println("학생의 이름은 "+name+"이고, "+grade+"학년입니다.");
	}
}
