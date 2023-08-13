package ch6;

// 예제 6-28 클래스 초기화 블럭을 이용한 배열요소 초기화
public class StaticBlockTest {
	static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			// 1과 10사이의 임의의 값을 배열 arr에 저장한다.
			arr[i] = (int)(Math.random()*10)+1;
		}
	}

	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] :"+arr[i]);
		}
	}

}
