package ch6;

// ���� 6-10
class ChangeData{ int x; }

public class ReferenceParamEx {
	public static void main(String[] args) {
		ChangeData d = new ChangeData();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	// �Ű������� ���������� �ٲٴ� ������ ����
	static void change(ChangeData d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
