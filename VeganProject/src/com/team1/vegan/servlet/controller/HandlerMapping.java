package com.team1.vegan.servlet.controller;

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
		if(command.equals("register.do")) {
			controller = new RegisterController();
		}if(command.equals("login.do")) {
			controller = new LoginController();
		}if(command.equals("update.do")) {
			controller = new UpdateController();
		}if(command.equals("delete.do")) {
			controller = new DeleteController();
		}if(command.equals("logout.do")) {
			controller = new LogoutController();
		}if(command.equals("idCheck.do")) {
			controller = new IdCheckController();
		}
		return controller;
	}
}



