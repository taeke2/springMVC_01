package com.care.springmvc02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.member.Member;

@Controller
public class MyController03 {
	@RequestMapping("index1")
	public String memberIndex() {
		return "/member03/index";
	}
	// 다른 패키지에 있는 컨트롤러를 사용하려면 선언을 해야하는데 그 위치는 spring폴더에 appServlet안에 있는
	// servlet-context.xml에 들어가서 젤밑에
	// <context:component-scan base-package="com.care.springmvc01" /> 기본으로 이렇게 되어있음
	// <context:component-scan base-package="com.care.springmvc02" /> 도 추가해줘야 함

	// 오류났었는데 오류난 이유 : 컨트롤러가 이름이 겹쳐서안됨.
	// 패키지가 달라도 클래스 이름이 똑같으면 컨트롤러가 객체로만들어지는데 이름이 중복되면 안됨

	/*
	@RequestMapping("result")
	public String result(@RequestParam("name") String name, @RequestParam("age") String age,
			@RequestParam("addr") String addr, Model model) {
		Member member = new Member();
		member.setName(name);
		member.setAge(age);
		member.setAddr(addr);
		model.addAttribute("mem", member);
		return "/member03/result";
	}
	*/
	@RequestMapping("result1")
	public String result(Member member, Model model) {
		System.out.println("name :" + member.getName() );
		System.out.println("age :" + member.getAge() );
		System.out.println("addr :" + member.getAddr() );
		return "/member03/result";
	}
	
}
