package ForQuiz0807;

public class ForQuiz_1 {

	public static void main(String[] args) {
		// 1��
		for(int i=1; i<=9; i++) {
			int answer1;
			answer1 = i-1;
			System.out.printf("%d %d%n",i,answer1);
		}
		
		
		System.out.println();
		
		// 2��
		for(int i=1; i<=9; i++) {
			int answer2;
			answer2 = 2*i;
			System.out.printf("%d %d%n",i,answer2);
		}
		
		System.out.println();
		
		// 3��
		for(int i=1; i<=9; i++) {
			int answer3;
			answer3 = 2*(i-1);
			System.out.printf("%d %d%n",i,answer3);
		}
		
		System.out.println();
		
		// 4��
		for(int i=1; i<=9; i++) {
			int answer4;
			answer4 = 2*i-1;
			System.out.printf("%d %d%n",i,answer4);
		}
		
		System.out.println();
		
		// 5��
		for(int i=1; i<=9; i++) {
			int answer5;
			answer5 = i*i;
			System.out.printf("%d %d%n",i,answer5);
		}
		
		
		System.out.println();
		
		// 6��
		for(int i=1; i<=9; i++) {
			int answer6;
			answer6 = 10-i;
			System.out.printf("%d %d%n",i,answer6);
		}
		
		
		System.out.println();
		
		// 7�� 
		for(int i=1; i<=9; i++) {
			int answer7;
			answer7 = (i-1)/3 + 1;
			System.out.printf("%d %d%n",i,answer7);
		}
		
		System.out.println();
		
		// 8��
		for(int i=1; i<=9; i++) {
			int answer8;
			answer8 = (i-1)%3 + 1;
			System.out.printf("%d %d%n",i,answer8);
		}
	}

}
