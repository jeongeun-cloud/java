package model;

public class DAO {
	
	private static final int MAX = 100;
	private DTO[] dtoArr = new DTO[MAX];
	private int top = 0;
	private int seq = 1;
	
	// ����
	{
		dtoArr[top++] = new DTO(seq++, "ju", 75, 95, 100, 270, 90.0);
		dtoArr[top++] = new DTO(seq++, "moon", 45, 65, 20, 130, 43.3);
		dtoArr[top++] = new DTO(seq++, "ju", 95, 95, 100, 290, 96.6);
		dtoArr[top++] = new DTO(seq++, "����", 60, 65, 80, 205, 68.3);
		dtoArr[top++] = new DTO(seq++, "������", 85, 90, 92, 190, 63.3);
	}
	

	// ����
	public void insert(DTO dto) {
		dto.setIdx(seq++);
		dtoArr[top++] = dto;
	}
	
	// �̱��� // ******
	private DAO() {

	}
	private static DAO instance;
	public static DAO getInstance() {
		if(instance == null) {
			instance = new DAO();
		}
		return instance;
	}

	// ��� ���
	public DTO[] show() {
		DTO[] newArr = new DTO[top];
		
		for(int i=0; i<top; i++) {
			newArr[i] = new DTO();
			newArr[i].setIdx(dtoArr[i].getIdx());
			newArr[i].setName(dtoArr[i].getName());
			newArr[i].setKor(dtoArr[i].getKor());
			newArr[i].setMath(dtoArr[i].getMath());
			newArr[i].setEng(dtoArr[i].getEng());
			newArr[i].setSum(dtoArr[i].getSum());
			newArr[i].setAvg(dtoArr[i].getAvg());
		}
		
		return newArr;
	}

	
	// ���� ���
	
	
	
	// �˻�
	public DTO[] select(DTO dto) {
		DTO[] newArr = new DTO[top];
		int cnt = 0;
		
		for(int i=0; i<top; i++) {
			if(dtoArr[i].getName().toUpperCase().equals(dto.getName().toUpperCase())) {
				newArr[cnt] = new DTO();
				newArr[cnt].setIdx(dtoArr[i].getIdx());
				newArr[cnt].setName(dtoArr[i].getName());
				newArr[cnt].setKor(dtoArr[i].getKor());
				newArr[cnt].setMath(dtoArr[i].getMath());
				newArr[cnt].setEng(dtoArr[i].getEng());
				newArr[cnt].setSum(dtoArr[i].getSum());
				newArr[cnt].setAvg(dtoArr[i].getAvg());
				cnt++;
			}
		}
		
		// ******
		DTO[] arr = new DTO[cnt];
		for(int i=0; i<cnt; i++) {
			arr[i] = newArr[i];
		}
		
		return arr;
	}

	
	
	// ����
	public void update(DTO dto) {
		System.out.println(dto);
		
	} 
	
	
	
}
