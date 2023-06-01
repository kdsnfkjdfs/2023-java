package s0525;

public class Employee {
	String name;
	int no;
	int age;
	
	Employee(){}
	
	Employee(String name,int no,int age){
		this.name = name;
		this.no = no;
		this.age = age;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	int getNo() {
		return no;
	}
	void setNo(int no) {
		this.age = no;
	}
	
	@Override
	 public String toString() {
		return "이름" + name +"[번호]"+no+"나이"+age;
	}
	void print(){
		System.out.println("직원정보"+toString());
	}
}
