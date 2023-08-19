package ch5;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		// 배열 arr에 1~5를 저장한다.
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		System.out.println("[변경전]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.printf("arr[%d]:%d%n",i,arr[i]);
		}
		
		int[] tmp = new int[arr.length*2];
		for(int i=0; i<arr.length; i++) {
			tmp[i] = arr[i];
		}
		arr = tmp;
		
		System.out.println("[변경후]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.printf("arr[%d]:%d%n",i,arr[i]);
		}
	}

}
