package org.comstudy21.resource;

import java.util.Scanner;

import org.comstudy21.model.Dao;
import org.comstudy21.view.Delete;
import org.comstudy21.view.Input;
import org.comstudy21.view.Menu;
import org.comstudy21.view.Modify;
import org.comstudy21.view.Output;
import org.comstudy21.view.Search;
import org.comstudy21.view.View;

public interface  R {
	String appTitle = "::::::::: 전화번호부 :::::::::";
	String menuTitle = ":::::::::: MENU ::::::::::";
	String inputTitle = "::::: 입력 기능 :::::";
	String outputTitle = "::::: 출력 기능 :::::";
	String searchTitle = "::::: 검색 기능 :::::";
	String modifyTitle = "::::: 수정 기능 :::::";
	String deleteTitle = "::::: 삭제 기능 :::::";
	String[] menuArr = {"","입력","출력","검색","수정","삭제","종료"};
	
	Scanner scan = new Scanner(System.in);
	
	// 바인딩 
	Data data = new Data();
	
	View[] viewArr = {new Menu(), new Input(), new Output(), new Search(), new Modify(), new Delete()};
	
	// Dao dao = new Dao(); // 싱글톤은 외부에서 이게 불가능 하게끔 하는 것 (여기저기서 만들면 사이즈가 늘어나기 때문)
	Dao dao = Dao.getInstance(); // 싱글톤이기때문에 이렇게 써야함
	
	
}
