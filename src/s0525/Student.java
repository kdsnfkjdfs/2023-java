package s0525;

public class Student {
	String name;
	int grade;
	
	Student(){}
	Student(String name){
		 this.name = name;
	}
	
	Student(String name , int grade){
	//	this.name = name;
		this(name);
		this.grade = grade;
	}
	
	void print() {
		System.out.println("�л��̸��� "+name+"�̰�"+grade+"�Դϴ�.");
	}
	void print2() {
		System.out.println("�л��̸��� "+getName()+"�̰�"+getName()+"�Դϴ�.");
	}
	
	String getName() {
		
		return name;
	}
	int getGrade() {
		return grade;
	}
	
	void setName(String name) {
		this.name = name;
	}
	void setGrade(int grade) {
		this.grade = grade;
	}


}
