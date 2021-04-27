package com.team1.vegan.servlet.controller;

import com.team1.vegan.servlet.controller.MemberController.DeleteController;
import com.team1.vegan.servlet.controller.MemberController.IdCheckController;
import com.team1.vegan.servlet.controller.MemberController.LoginController;
import com.team1.vegan.servlet.controller.MemberController.LogoutController;
import com.team1.vegan.servlet.controller.MemberController.RegisterController;
import com.team1.vegan.servlet.controller.MemberController.UpdateController;

//ControllerFactory에서 이름을 바꿈
public class HandlerMapping {
	private static HandlerMapping factory = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return factory;
	}
	
	//Component를 생성...command하는 기능...factory 본연의 역할
	public Controller createController(String command) { // controller에서는 인터페이스 부모 타입으로 리턴
		Controller controller = null;

		if(command.equals("Member/register.do")) {
			controller = new RegisterController();
		}if(command.equals("Member/login.do")) {
			controller = new LoginController();
		}if(command.equals("Member/update.do")) {
			controller = new UpdateController();
		}if(command.equals("Member/delete.do")) {
			controller = new DeleteController();
		}if(command.equals("Member/logout.do")) {
			controller = new LogoutController();
		}if(command.equals("Member/idCheck.do")) {

			controller = new IdCheckController();
		}
		return controller;
	}
}



