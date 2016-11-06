 class Point {
	double x,y,z;
	Point(double _x, double _y,double _z) {
		x = _x;
		y = _y;
		z = _z;
	}
	double pointDistance(Point g) {
		double sum=Math.sqrt((x-g.x)*(x-g.x)+(y-g.y)*(y-g.y)+(z-g.z)*(z-g.z));
		return sum;
	}
	void setX(double _x) {
		x = _x;
	}
	void setY(double _y) {
		y = _y;
	}
	void setZ(double _z) {
		z = _z;
	}
}
 public class Distance {
	public static void main(String agrs[]) {
		Point p = new Point(1,1,1);
		System.out.println(p.pointDistance(new Point(0.5,0.6,3)));
		p.setX(999.9);
		p.setY(999.9);
		p.setZ(999.9);
		System.out.println(p.pointDistance(new Point(0.5,0.6,3)));
	}
}
