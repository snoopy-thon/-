class Data { int x; }

public class PrimitiveParamEx {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	// �Ű������� �⺻���� �� �޼ҵ忡�� �����Ϸ��� �ص� ���� �� ���� �ȵ�
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
