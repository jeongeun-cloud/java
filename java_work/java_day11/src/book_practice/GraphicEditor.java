package book_practice;

import java.util.Scanner;

abstract class Shape {
	private Shape next;
	public Shape() {
		next = null;
	}
	public void setNext(Shape obj) {
		next = obj;
	}
	public Shape getNext() {
		return next;
	}
	public abstract void draw();
}


class Line extends Shape {
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}


public class GraphicEditor {
	private Shape start;
	private Shape cur;
	private Shape tail;
	
	Scanner scan = new Scanner(System.in);
	
	private int menu() {
		System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >>> ");
		return scan.nextInt();
	}

	private void Insert() {
		System.out.print("Line(1), Rect(2), Circle(3) >>> ");
		Shape newNode = null;
		switch(scan.nextInt()) {
		case 1 : newNode = new Line(); break;
		case 2 : newNode = new Rect(); break;
		case 3 : newNode = new Circle(); break;
		default : System.out.println("해당 사항이 없습니다!"); return;
		}
		
		if(start == null) {
			start = newNode;
			tail = start;
			return;
		}
		tail.setNext(newNode);
		tail = tail.getNext();
		
	}
	
	private void Delete() {
		
		System.out.print("삭제할 도형의 위치 >>> ");
		int num = scan.nextInt();
		

	}
	
	private void Show() {
		// 출력할 내용이 하나도 없으면
		if(start == null) {
			return;
		}
		
		// cur null이 아닐때까지 계속 돌면서 출력 
		cur = start;
		while (cur.getNext() != null) {
			cur.draw();
			cur = cur.getNext();
		}
		// 마지막은 getNext 가 null이어서 위에서 출력을 안하기 때문에
		// 한번 더 출력해주기 위해 아래와 같이 작성.
		cur.draw();
	}
	
	private void Quit() {
		System.out.println("beauty를 종료합니다.");
		System.exit(0);
	}
	
	
	public GraphicEditor() {
		while(true) {
			switch(menu()) {
			case 1 : Insert(); break;
			case 2 : Delete(); break;
			case 3 : Show(); break;
			case 4 : Quit(); break;
			default : System.out.println("해당 사항이 없습니다.");
			}
		}
	}


	public static void main(String[] args) {
		new GraphicEditor();
	}

}
