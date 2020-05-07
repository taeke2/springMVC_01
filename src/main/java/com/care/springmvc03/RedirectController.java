package com.care.springmvc03;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RedirectController {
	@RequestMapping("index")
	public String index() {
		return "redirect01/index";
	}

	@RequestMapping("result")
	public String result(Model model, HttpServletRequest request) {
		String id = request.getParameter("id");
		System.out.println("id : " + id);
		model.addAttribute("test","연습중!!!");
		//ra.addAttribute("test", "ra를 통해 넘어온 값");
		if (id.equals("abc")) {
			return "redirect:rsOK";
			// return "redirect01/rsOK"; //redirect는 데이터를 넘겨줄때 사용한다. 페이지만 보여줄때는 경로를 표시해줘도
			// 된다.
		}
		return "redirect:rsNO";
	}

	@RequestMapping("rsOK")
	public String rsOK(Model model) {
		model.addAttribute("name", "홍길동");
		return "redirect01/rsOK";
	}

	@RequestMapping("rsNO")
	public String rsNO(@RequestParam("test") String aaa, Model model, HttpServletRequest request) {
		System.out.println("RequestParam  : " + aaa);
		System.out.println("req : " + request.getAttribute("test"));
		System.out.println("req : " + request.getParameter("test"));
		return "redirect01/rsNO";
	}
}
