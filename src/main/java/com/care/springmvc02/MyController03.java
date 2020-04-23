package com.care.springmvc02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.member.Member;

@Controller
public class MyController03 {
	@RequestMapping("index")
	public String memberIndex() {
		return "/member03/index";
	}
	// �ٸ� ��Ű���� �ִ� ��Ʈ�ѷ��� ����Ϸ��� ������ �ؾ��ϴµ� �� ��ġ�� spring������ appServlet�ȿ� �ִ�
	// servlet-context.xml�� ���� ���ؿ�
	// <context:component-scan base-package="com.care.springmvc01" /> �⺻���� �̷��� �Ǿ�����
	// <context:component-scan base-package="com.care.springmvc02" /> �� �߰������ ��

	// ���������µ� ������ ���� : ��Ʈ�ѷ��� �̸��� ���ļ��ȵ�.
	// ��Ű���� �޶� Ŭ���� �̸��� �Ȱ����� ��Ʈ�ѷ��� ��ü�θ�������µ� �̸��� �ߺ��Ǹ� �ȵ�

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
	@RequestMapping("result")
	public String result(Member member, Model model) {
		System.out.println("name :" + member.getName() );
		System.out.println("age :" + member.getAge() );
		System.out.println("addr :" + member.getAddr() );
		return "/member03/result";
	}
	
}
