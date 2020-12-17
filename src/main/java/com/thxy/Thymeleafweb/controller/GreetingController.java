package com.thxy.Thymeleafweb.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thxy.Thymeleafweb.pojo.User;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	@ResponseBody
	public String greeting() {
		System.out.println("Hello");
		return "greeting";
	}

	@GetMapping("/hi")
	// 第一个
	// public String hi(@RequestParam(name="name", required=false,
	// defaultValue="World")String name,Model model) { model.addAttribute("name",
	// name); return "hi"; }
//第二个
//	public String hi(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
//		model.addAttribute("name", name);
//		User user = new User();
//		user.setName("张三");
//		Locale locale = new Locale("zh", "CN");
//		Calendar today = Calendar.getInstance();
//		model.addAttribute("locale", locale);
//		model.addAttribute("today", today);
//		model.addAttribute("user", user);
//		return "hi";
//	}
	public String hi(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		model.addAttribute("name", name);
		List<User> userList = new ArrayList<User>();
		User user = new User();
		user.setName("张三");
		userList.add(user);
		User user1 = new User();
		user1.setName("李四");
		userList.add(user1);
		User user2 = new User();
		user2.setName("王五");
		userList.add(user2);
		model.addAttribute("userList", userList);
		return "hi";
	}
}
