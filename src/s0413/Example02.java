package s0413;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j = 1; j<=4;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
	
		for(int i=1;i<=4;i++) {
			for(int j = 1; j<=4;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
	
		for(int i=3;i>0;i--) {
			for(int j = i; j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=0;i<3;i++) {
			for(int j = 1; j<=3-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=3;i++) {
			for(int j = 0; j<4-i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	
	}

}
