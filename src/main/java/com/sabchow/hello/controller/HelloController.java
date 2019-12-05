package com.sabchow.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(value = "/sayHello", method = RequestMethod.GET)
	public String sayHello() {
		return "hello world!你好";
	}

	@RequestMapping("/thymeleaf")
	public String thymeleaf(Model model) {
		model.addAttribute("name", "simonsfan");
		return "page/index";
	}

	@RequestMapping("/orderList")
	public String queryOrderList(Model model) {
		model.addAttribute("name", "今晚打老虎");
		return "system/order-list";
	}

}
