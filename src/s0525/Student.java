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
		System.out.println("학생이름은 "+name+"이고"+grade+"입니다.");
	}
	void print2() {
		System.out.println("학생이름은 "+getName()+"이고"+getName()+"입니다.");
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
