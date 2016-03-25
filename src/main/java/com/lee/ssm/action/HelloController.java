package com.lee.ssm.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lee.ssm.bean.User;
import com.lee.ssm.service.IUserService;

@Controller
@RequestMapping("/root")
public class HelloController {
	
	@Resource
	private IUserService userService;
	
	@RequestMapping(value = "/hello")
	public String home(Model model) throws Exception {
		
		User user = userService.findUserById(1);
		model.addAttribute("username", user.getName());
		
		return "home";
	}
	
}
