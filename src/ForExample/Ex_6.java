package ForExample;
/*
	*****
	****
	***
	**
	*
*/
public class Ex_6 {
	public static void main(String[] args) {
		// ���� Ǭ ���
		for(int i=0; i<5; i++) {
			
			for(int j=1; j<=5-i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		System.out.println();
		
		// �ٸ� Ǯ�̹�
		for(int i=1; i<=5; i++) {
			for(int j=1; i+j<=6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
