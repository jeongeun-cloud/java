package ch05_exercise;

class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}

class Circle extends Shape {
	public void paint() {
		
	}
	public void draw() {
		System.out.println("Circle");
	}
}

public class Ch05Ex12 {
	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
	}
}
