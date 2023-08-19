package ch7;
// 예제 7-7
public class PointTest {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(1,2,3);
		System.out.println(p3.getLocation());
	}
}

class Point2{
	int x,y;
	
	//Point2(){}
	
	Point2(int x,int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2{
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	
	String getLocation() {
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}
