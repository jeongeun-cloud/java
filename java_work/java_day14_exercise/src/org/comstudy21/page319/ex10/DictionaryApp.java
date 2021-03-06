package org.comstudy21.page319.ex10;

class Dictionary extends PairMap {
	
	int top = 0;
	
	public Dictionary(int size) {
		keyArray = new String[size];
		valueArray = new String[size];
	}

	@Override
	public String get(String key) {
		for(int i=0; i<top; i++) {
			if(keyArray[i].equals(key)) {
				return valueArray[i];
			}
		}
		return null;
	}

	@Override
	public void put(String key, String value) {
		if(top >= keyArray.length) {
			return;
		}
		
		// 똑같은 값 찾아서 수정
		for(int i=0; i<top; i++){
			if(keyArray[i].equals(key)) {
				valueArray[i] = value;
				return;
			}
		}
		
		// 다 돌아도 없을 경우 top번지에
		keyArray[top] = key;
		valueArray[top] = value;
		top++;
	}

	@Override
	public String delete(String key) {
		String value = null;
		for(int i=0; i<top; i++){
			if(keyArray[i].equals(key)) {
				value = valueArray[i];
				for(int j=i; j<top-1; j++) {
					keyArray[j] = keyArray[j+1];
					valueArray[j] = valueArray[j+1];
				}
				top--;
			}
		}
		return value;
	}

	@Override
	public int length() {
		return top;
	}
	
}

public class DictionaryApp {

	public static void main(String[] args) {
		
		Dictionary dic = new Dictionary(10);
		
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++"); // 이재문의 값을 C++로 수정
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));

		dic.delete("황기태"); // 황기태 아이템 삭제
		System.out.println("황기태의 값은 " + dic.get("황기태")); // 삭제된 아이템 접근

	}

}
