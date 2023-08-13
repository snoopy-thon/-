package ch6;
// 예제 6-26 생성자를 이용한 인스턴스의 복사
class Car3{
	String color;
	String gearType;
	int door;
	
	Car3(){
		this("white", "auto", 4);
	}
	
	Car3(Car3 c){ //인스턴스의 복사를 위한 생성자(참조변수를 매개변수로 선언)
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
	
	Car3(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Car3 c1 = new Car3();
		Car3 c2 = new Car3(c1); // c1의 복사본 c2를 생성한다.
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door );
		
		c1.door = 100;   // c1의 인스턴스변수 door의 값을 변경한다.
		System.out.println("c1.door=100; 수행후");
		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door );
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door );
		
	}

}
