package model;



public class DAO {
	public static final int MAX = 100;
	private DTO[] dtoArr = new DTO[MAX];
	private int top = 0;
	private int seq = 1;
	
	{
		dtoArr[top++] = new DTO (seq++,"주정은","1234"); 
		dtoArr[top++] = new DTO (seq++,"ju","11111"); 
		dtoArr[top++] = new DTO (seq++,"ju","2222"); 
		dtoArr[top++] = new DTO (seq++,"Moon","3333"); 
		dtoArr[top++] = new DTO (seq++,"정은","4444"); 
	}
	
	// 싱글톤
	private DAO() {}
	private static DAO instance; 
	public static DAO getInstance() {
		if(instance == null) {
			instance = new DAO();
		}
		return instance;
	}
	
	// 입력
	public void insert(DTO dto) {
		dto.setIdx(seq++);
		dtoArr[top++] = dto;
	}
	
	// 출력
	public DTO[] show() {
		DTO[] arr = new DTO[top];
		
		for(int i=0; i<top; i++) {
			arr[i] = new DTO();
			arr[i].setIdx(dtoArr[i].getIdx());
			arr[i].setName(dtoArr[i].getName());
			arr[i].setPhone(dtoArr[i].getPhone());

		}
		return arr;
	}
	
	// 검색
	public DTO[] select(DTO dto) {
		DTO[] newArr = new DTO[top];
		int cnt = 0;
		
		for(int i=0; i<top; i++) {
			if(dtoArr[i].getName().toUpperCase().equals(dto.getName().toUpperCase())) {
				newArr[cnt] = new DTO();
				newArr[cnt].setIdx(dtoArr[i].getIdx());
				newArr[cnt].setName(dtoArr[i].getName());
				newArr[cnt].setPhone(dtoArr[i].getPhone());
				cnt++;
			}
		}
		
		DTO[] arr = new DTO[cnt];
		for(int i=0; i<cnt; i++){
			arr[i] = newArr[i];
		}
		
		return arr;
	}

	public void update(DTO dto) {
		boolean flag = false;
		
		for(int i=0; i<top; i++) {
			if(dtoArr[i].getIdx() == dto.getIdx()) {
				dtoArr[i] = dto;
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("수정 성공!");
		} else { 
			System.out.println("수정 실패!");
		}
		
	}

	public void remove(DTO dto) {
		boolean flag = false;
		
		for(int i=0; i<top; i++) {
			if(dtoArr[i].getIdx() == dto.getIdx()) {
				for(int j=i; j<top-1; j++) {
					dtoArr[j] = dtoArr[j+1];
				}
				top--;
				flag = true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("삭제 성공!");
		} else {
			System.out.println("삭제 실패!");
		}
		
	}

}
