package com.care.springmvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@RequestMapping("aaa")
	public String memberIndex() {
		
		return "/member/index";
	}
	
	@RequestMapping(value="/logout")
	public String memberLogout(Model model) {
		model.addAttribute("logout","로그아웃");
		return "/member/logout";
	}
}
