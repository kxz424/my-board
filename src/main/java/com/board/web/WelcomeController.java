package com.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/helloworld")
	public String welcome(String name, int age, Model model) {
		System.out.println("name : " + name + "  " + "age : " + age);
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "welcome";  //""안에 있는 문자열과 똑같은 html 파일을 templates에서 찾아서 호출
	}
}
