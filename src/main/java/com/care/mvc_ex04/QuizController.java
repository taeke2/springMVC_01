package com.care.mvc_ex04;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.care.member.Member;

@Controller
public class QuizController {
	@RequestMapping("mvc_ex04/login")
	public String login() {
		return "mvc_ex04/login";
	}

	@RequestMapping("mvc_ex04/loginChk")
	public String result(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if (id.equals("aaa") && pw.equals("111")) {
			return "mvc_ex04/member";
		}
		return "redirect:login";
	}

	@RequestMapping("mvc_ex04/member")
	public String member(Model model, HttpServletRequest request) {
		return "mvc_ex04/member";
	}

	@RequestMapping("mvc_ex04/memberInput")
	public String memberInput(Model model, Member member, HttpServletRequest request) {
		model.addAttribute("name", member.getName());
		model.addAttribute("age", member.getAge());
		model.addAttribute("addr", member.getAddr());
		return "mvc_ex04/memberInfo";
	}
}
