package ForExample;
/*
	*****
	******
	*******
	********
	*********
*/
public class Ex_7 {

	public static void main(String[] args) {
		// ���� Ǯ�̹�
		for(int i=5; i<=9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// �ٸ� Ǯ�̹�
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i+4; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
