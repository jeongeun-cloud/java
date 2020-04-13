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
		// JSON 파일로 부터 읽어들이기
		String filepath = "students.json";
		
//		InputStream inputStream = Ex01_2.class.getResourceAsStream(filepath); // 파일의 상대경로 
//		if(inputStream == null) {
//			System.out.println("파일을 읽을 수 없습니다!");
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
				// JSONArray 는 ArrayList 같은 컬렉션 객체이다
				JSONArray jsonArr = studentObj.getJSONArray("studentArr");
				Vector<Vector> vector = new Vector<>();
				for(int i=0; i<jsonArr.length(); i++) {
					JSONObject jsonObj = (JSONObject)jsonArr.get(i);
					// System.out.println(jsonObj); // 한 줄 씩 
					// System.out.println(jsonObj.get("name")); // key값을 이용해서 이름만 출력 
					
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
			System.out.println("파일을 찾을 수 없습니다!");
		}
	}
	
	// JSONObject의 메소드
	// JSONObject는 Map과 유사하고, JSONArray는 ArrayList와 유사하다.

}
