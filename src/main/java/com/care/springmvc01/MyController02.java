package com.care.springmvc01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController02 {
	@RequestMapping("/member02/index")
	public String memberIndex() {
		return "/member02/index";
	}

	@RequestMapping("/member02/result")
	public String memberResult(HttpServletRequest req, Model model) {
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		model.addAttribute("name", req.getMethod() + "=>" + name);
		model.addAttribute("age", req.getMethod() + "=>" + age);

		return "/member02/result";
	}

	// 메소드 방식을 명시하면 명시한 메소드를 찾아가서 실행한다.
	//@RequestMapping(value = "/member02/result", method = RequestMethod.POST)
	@PostMapping("/member02/result")
	public String memberResult02(@RequestParam("name") String name, @RequestParam("age") String age, Model model) {
		model.addAttribute("name", name + " 포스트");
		model.addAttribute("age", age + " 포스트");
		return "member02/result";
	}
}
