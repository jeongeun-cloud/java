package org.comstudy21.page317;

public class Point3D extends Point {
	private int z;
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public Point3D() {
		this(0,0,0);
	}

	private void setXY(int x, int y) {
		move(x, y);
	}
	
	@Override
	public String toString() {
		return "("+ getX() + "," + getY() +"," + z +")";
	}

	private void moveUp() {
		z++;
	}
	
	private void moveDown() {
		z--;
	}
	
	private void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println(p + "의 점입니다.");
		
		p.moveUp();
		System.out.println(p + "의 점입니다.");
		
		p.moveDown();
		
		p.move(10,10);
		System.out.println(p + "의 점입니다.");

		p.move(100,200,300);
		System.out.println(p + "의 점입니다.");
	}



}
