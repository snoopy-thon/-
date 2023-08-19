package ch6;

class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result = mm.max(5, 3); // �� �߿� ū ���� ��ȯ�ϴ� �޼���
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		
		System.out.println("max(5L, 3L) = " + result);
		System.out.println("add(5L, 3L) = " + result1);
	}

}

class MyMath {
	void printGugudan(int dan) {
		if(!(2<=dan && dan <=9))
			return;
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i ,dan * i);
		}
		// return; ��ȯŸ���� void�̹Ƿ� ��������
	}
	long add(long a, long b) {
		return a + b;
	}
	long subtract(long a, long b) {
		return a - b;
	}
	long multiply(long a, long b) {
		return a * b;
	}
	double divide(double a, double b) {
		return a / b;
	}
	long max(long a, long b) {
		return a > b ? a : b;
	}
}
