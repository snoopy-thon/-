
public class �迭�������� {
	public static void main(String[] args) {
	// ���� ���� Ƚ�� ���ϱ� 
	int[] numArr = {1, 5, 3, 2, 1, 5, 2,7,8,3,5,6,10,5};
	int[] cntArr = new int[10];
	for(int i : numArr){
		cntArr[i-1]++;
	}
	for(int j=1; j<=10; j++) {
		System.out.printf("%d�� ���� Ƚ�� : %dȸ\n", j, cntArr[j-1]);
	}
  }
}
