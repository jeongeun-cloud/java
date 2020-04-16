package test.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.InputStream;
import java.util.Vector;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Ex01_2 {
	
	public static void main(String[] args) {
		// JSON ���Ϸ� ���� �о���̱�
		String filepath = "students.json";
		
//		InputStream inputStream = Ex01_2.class.getResourceAsStream(filepath); // ������ ����� 
//		if(inputStream == null) {
//			System.out.println("������ ���� �� �����ϴ�!");
//			return;
//		}
//		JSONTokener tokener = new JSONTokener(inputStream);
		
		File file = new File(filepath);
		if(file.exists()) {
			FileReader fileReader;
			try {
				fileReader = new FileReader(filepath);
				JSONTokener tokener = new JSONTokener(fileReader);
				JSONObject studentObj = new JSONObject(tokener);
				
				System.out.println("cnt => " + studentObj.get("cnt"));
				
				// System.out.println(studentObj.toString(2));
				// JSONArray �� ArrayList ���� �÷��� ��ü�̴�
				JSONArray jsonArr = studentObj.getJSONArray("studentArr");
				Vector<Vector> vector = new Vector<>();
				for(int i=0; i<jsonArr.length(); i++) {
					JSONObject jsonObj = (JSONObject)jsonArr.get(i);
					// System.out.println(jsonObj); // �� �� �� 
					// System.out.println(jsonObj.get("name")); // key���� �̿��ؼ� �̸��� ��� 
					
					Vector v = new Vector<>();
					v.add(jsonObj.get("name"));
					v.add(jsonObj.get("email"));
					v.add(jsonObj.get("phone"));
					vector.add(v);
				}
				System.out.println(vector);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		} else { 
			System.out.println("������ ã�� �� �����ϴ�!");
		}
	}
	
	// JSONObject�� �޼ҵ�
	// JSONObject�� Map�� �����ϰ�, JSONArray�� ArrayList�� �����ϴ�.

}