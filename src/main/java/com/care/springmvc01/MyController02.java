package com.care.springmvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController02 {
	@RequestMapping("/member02/index")
	public String memberIndex() {
		return "/member02/index";
	}
}
