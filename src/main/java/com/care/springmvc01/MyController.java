package com.care.springmvc01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("aaa")
	public String memberIndex() {
		return "/member/index";
	}
	
	@GetMapping(value="/logout")
	public String memberLogout(Model model) {
		model.addAttribute("logout","로그아웃");
		//데이터베이스 연동 후 결과값 가져옴
		//그럼 Model에 담아서 넘어간다
		return "/member/logout";
	}
	
	@RequestMapping("login")
	public ModelAndView memberLogin() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("login","로그인 성공!!!");
		mv.setViewName("member/login");
		return mv;
	}
}
