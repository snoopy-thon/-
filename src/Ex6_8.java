//ch6-25 ������ ��ȯŸ��
// 1.Data3, Data4 Ŭ���� ����
class Data3 { int x; }
class Data4 { int x; }
public class Ex6_8 {
	public static void main(String[] args) {
		// 2.�������� d�� ����Ű�� Data3 ��ü ���� �� ������� x���� 10���� �Ҵ�
		Data3 d = new Data3();
		d.x = 10;
		// 3.copy �޼���� d2�� d�� ��(��ü �ּ�)�� �����Ѵ�.
		Data3 d2 = copy(d);
		// 7.Data4 �������� d1�� ����Ű�� ��ü ���� �� ������� x���� 20���� �Ҵ�
		Data4 d1 = new Data4();
		d1.x = 20;
		// 8.�ٲ���� d1.x�� ���
		System.out.println("���� d1�� : "+d1.x);
		// 9. change �޼��� ȣ��
		change(d1);
		// 12. d.x�� d2.x ������ �� ���
		System.out.println("d.x�� : " + d.x);
		System.out.println("d2.x�� : " + d2.x);
		
	}
	// copy �޼��� - ���������� �Ű������� �ޱ�
	static Data3 copy(Data3 d) {
		// 4.�������� tmp�� ����Ű�� ��ü ����
		Data3 tmp = new Data3();
		// 5.�Ű������� �޾ƿ� d.x���� tmp.x�� ����
		tmp.x = d.x;
		// 6.tmp�� ����ִ� ��ü�� �ּҹ�ȯ
		return tmp;
	}
	// change �޼��� - ���������� �Ű������� �ޱ�
	static void change(Data4 d) {
		// 10.x�� ���ο� �� �Ҵ�
		d.x = 100;
		// 11.�ٲﰪ ���
		System.out.println("�ٲﰪ ��� : "+ d.x);
	}

}
