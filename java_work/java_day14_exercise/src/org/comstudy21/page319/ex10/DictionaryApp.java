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
		
		// �Ȱ��� �� ã�Ƽ� ����
		for(int i=0; i<top; i++){
			if(keyArray[i].equals(key)) {
				valueArray[i] = value;
				return;
			}
		}
		
		// �� ���Ƶ� ���� ��� top������
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
		
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++"); // ���繮�� ���� C++�� ����
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));

		dic.delete("Ȳ����"); // Ȳ���� ������ ����
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����")); // ������ ������ ����

	}

}