package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double width;
	private double length;
	public Rectangle(double w, double l) {
		width = w;
		length = l;
	}
	public Double Area() {
			return width * length;
	}
	public Double Perimeter() {
		return 2 * length + 2 * width;
	}
	public Boolean IsSquare() {
		if (width == length) {
			return true;
		} else {
			return false;
		}
	}
	public Boolean SameSize(Rectangle rectangle) {
		if (rectangle.width * rectangle.length == width * length) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Rectangle tester = new Rectangle(5.0, 5.0);
		Rectangle rectangle = new Rectangle(8.0, 2.0);
		System.out.println(tester.Area());
		System.out.println(tester.Perimeter());
		System.out.println(tester.IsSquare());
		System.out.println(tester.SameSize(rectangle));
	}
}
