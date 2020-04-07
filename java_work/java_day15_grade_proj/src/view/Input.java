package view;

import model.DTO;

public class Input implements View {

	@Override
	public void display() {
		System.out.println();
		System.out.println(inputTitle);
		
		DTO dto = new DTO();
		
		System.out.print("�̸� �Է� : ");
		dto.setName(scan.next());
		System.out.print("���� ���� : ");
		int kor = scan.nextInt();
		dto.setKor(kor);
		System.out.print("���� ���� : ");
		int math = scan.nextInt();
		dto.setMath(math);
		System.out.print("���� ���� : ");
		int eng = scan.nextInt();
		dto.setEng(eng);
		
		int sum = kor + math + eng;
		double avg = sum/3;
		
		dto.setSum(sum);
		dto.setAvg(avg);
		
		data.dto = dto;
		
		System.out.println("�Է� ����!");

	}

}