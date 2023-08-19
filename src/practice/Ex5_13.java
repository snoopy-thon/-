package practice;
import java.util.Scanner;

public class Ex5_13 {

	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();
			// 임의의 인덱스를 추출
			int randomNum = (int)(Math.random()*words[i].length());
			// 임의의 인덱스와 0번째 값을 교체
			char tmp = question[0];
			question[0] = question[randomNum];
			question[randomNum] = tmp;
			//
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
			
			String answer = scanner.nextLine();
			
			if(words[i].equals(answer.trim()))
				System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다.%n%n");
		}
	}

}
