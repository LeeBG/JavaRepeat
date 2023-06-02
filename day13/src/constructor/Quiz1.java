package constructor;

class Circle {
	private double size;
	private double radius;
	public static final double pi = 3.14159265358979323846;

	Circle() {
		this(1.0);
	}

	Circle(double radius) {
		this.radius = radius;
		setSize(radius * radius * pi);
	}

	Circle(int radius) {
		this((double)radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setSize(double size) {
		this.size = size;
	}
	public double getSize() {
		return size;
	}
	
}

public class Quiz1 {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(3);
		Circle c3 = new Circle(2.4);

		System.out.printf("c1.getSize() : %.2f\n", c1.getSize());
		System.out.printf("c2.getSize() : %.2f\n", c2.getSize());
		System.out.printf("c3.getSize() : %.2f\n", c3.getSize());
	}
}
