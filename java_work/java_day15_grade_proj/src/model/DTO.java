package model;

public class DTO {
	private int idx;
	private String name;
	private int kor;
	private int math;
	private int eng;
	private int sum;
	private double avg;
	
	public DTO() {
		// TODO Auto-generated constructor stub
	}
	
	public DTO(int idx, String name, int kor, int math, int eng, int sum, double avg) {
		this.idx = idx;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
		this.sum = sum;
		this.avg = avg;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	
	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return idx + ". " + name + " 학생의 점수 : [" + "국어=" + kor + ", 수학=" + math + ", 영어=" + eng+ ", 총점=" + sum+ ", 평균=" + avg + "]" ;
	}

	
	
}
