package org.comstudy21.main;

import static org.comstudy21.resource.R.*;

import org.comstudy21.controller.Controller;

public class MainCls {
	public static void main(String[] args) {
		System.out.println(appTitle);
		
		// Controller ȣ��
		Controller.service();
		
	}
}