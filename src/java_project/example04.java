package java_project;

public class example04 {

	public static void main(String[] args) {
		
		int a[] = new int[3];
		int []b = new int[5];
		int c[] = {1,2,3,4,5,6};
		int d[] = new int[] {7,8,9};
		
		System.out.println("a의 길이는"+ a.length);
		
		for(int i=0; i<a.length;i++) {
			System.out.println("a["+"] = "+ a[i]);
			
		}
		
		String str[] = new String[3];
		str[0] = "hello";
		str[1] = "Java"; 
		str[2] = "World";
		
		for(int i=0; i<str.length;i++)
			System.out.println(str[i]);
		
		
	}
	
	
	
}
