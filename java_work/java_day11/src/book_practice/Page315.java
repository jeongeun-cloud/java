package book_practice;

import java.util.Scanner;

abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString(); 
	protected double ratio;	// ����
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�");
		System.out.print(getSrcString() + "�� �Է��ϼ��� >> ");
		double val = scan.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ��� : " + res + getDestString() + "�Դϴ�");
		scan.close();
	}
	
	
}

class Won2Dollar extends Converter {

	public Won2Dollar (double ratio){
		this.ratio = ratio;
	}
	
	@Override
	public double convert(double src) {
		return src / ratio;
	}
	
	@Override
	public String getSrcString() {
		return "��";
	}
	
	@Override
	public String getDestString() {
		return "�޷�";
	}
	
}


class Km2Mile extends Converter {
	
	public Km2Mile (double ratio){
		this.ratio = ratio;
	}
	
	@Override
	public double convert(double src) {
		return src / ratio;
	}
	
	@Override
	public String getSrcString() {
		return "Km";
	}
	
	@Override
	public String getDestString() {
		return "mile";
	}	
}


public class Page315 {
	
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);	// 1������ 1.6km
		toMile.run();
	}

	public static void mainDollar(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
		
	}

}