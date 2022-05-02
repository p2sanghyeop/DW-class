package com.example.first_spring.controller;

import java.util.ArrayList;
import java.util.List;

//@Controller : url을 요청받는곳
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_spring.controller.vo.UserVO;
@RestController
public class mainController {
	
	@GetMapping("/index")
	public String call() {//index라는 주소를 요청하면 call () 메소드 실행
		String word = "sang hyeop hello world";
				return word;
	}
	@GetMapping("/sum")
	public int callSum() {
		int x= 10;
		int y= 100;
		return x+y;
	}
	@GetMapping("/soul")
	public String[] callsoul() {
		String list [] = {"Demons Soul","DarkSoul","DarkSoul2","Blood Born","DarkSoul3","Sekiro","Elden Ring"};
		return list;
	}
	@GetMapping("/user")
	public UserVO callUser() {
		UserVO vo = new UserVO("고길동",20);
		return vo;
	}
	@GetMapping("/userlist")
	public List<UserVO> calllist() {
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("유영준", 30));
		list.add(new UserVO("영준쓰", 30));
		list.add(new UserVO("영준치", 30));
		list.add(new UserVO("영쭌", 30));
		list.add(new UserVO("영준", 30));
		return list;
	}
}
