package org.comstudy21.page317;

public class PositivePoint extends Point {
	public PositivePoint(int x, int y) {
		super(x<0?0:x, y<0?0:y);
	}
	
	public PositivePoint() {
		super(0,0);
	}
	
	@Override
	public String toString() {
		return "("+ getX() + "," + getY() +")";
	}
	
	public void move(int x, int y) {
		if(x<0 || y<0) {
			return;
		}
		super.move(x, y);
	}
	
	public static void main(String[] args) {
		PositivePoint p = new PositivePoint(1,2);
		System.out.println(p + "�� ���Դϴ�.");
		
		p.move(-100,-200);
		System.out.println(p + "�� ���Դϴ�.");
		
		PositivePoint p2 = new PositivePoint(-1,-2);
		System.out.println(p2 + "�� ���Դϴ�.");
	}



}