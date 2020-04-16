package test.json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class Ex01_1 {
	
	public static void main(String[] args) {
		// JSONObject, JSONArray, JSONTokener ...
		// {key:value, key:value ...}
		// [{...},{...} ...]
		
		JSONObject student = new JSONObject();
		student.put("name", "ȫ�浿");
		student.put("email", "hong@a.com");
		student.put("phone", "010-1111-1111");
		
		// System.out.println(student);  
		// System.out.println(student.toString(2)); �δ�Ʈ ���� �� �� ����
		JSONArray studentArr = new JSONArray();
		studentArr.put(student);
		
		student = new JSONObject();
		student.put("name", "��浿");
		student.put("email", "kim@a.com");
		student.put("phone", "010-2222-2222");
		studentArr.put(student);
		
		//System.out.println(studentArr.toString(2));
		
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("studentArr", studentArr);
		
		jsonObj.put("cnt", 2);
		System.out.println(jsonObj.toString(2));
		
		File file = new File("students.json");
		try {
			if (!file.exists()) {
				if (file.createNewFile()) {
					System.out.println("�� ������ �����Ǿ����ϴ�!");
				}
			}
			FileWriter fw = new FileWriter(file);
			fw.write(jsonObj.toString(2));
			System.out.println("���� ���� �Ϸ�!");
			if(fw != null) {
				fw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

// JSON-in (org.json) 
// GSON - google ���̺귯�� ---- ���÷����� ����
// JSON���� ���̺귯���� ����.
