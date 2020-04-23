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
		model.addAttribute("logout","�α׾ƿ�");
		//�����ͺ��̽� ���� �� ����� ������
		//�׷� Model�� ��Ƽ� �Ѿ��
		return "/member/logout";
	}
	
	@RequestMapping("login")
	public ModelAndView memberLogin() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("login","�α��� ����!!!");
		mv.setViewName("member/login");
		return mv;
	}
}
