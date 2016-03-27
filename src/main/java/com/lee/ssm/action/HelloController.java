package com.lee.ssm.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lee.ssm.bean.User;
import com.lee.ssm.service.IUserService;

/**
 * 
 * @Title: HelloController.java
 * @Package com.lee.ssm.action
 * @Description: TODO
 * Copyright: Copyright (c) 2016
 * Company:Nathan.Lee.Salvatore
 * 
 * @author leechenxiang
 * @date 2016年3月25日 下午10:34:51
 * @version V1.0
 */
@Controller
@RequestMapping("/root")
public class HelloController {
	
	@Resource
	private IUserService userService;

	/**
	 * 
	 * @Description: TODO
	 * @param model
	 * @return
	 * @throws Exception
	 * 
	 * @author leechenxiang
	 * @date 2016年3月25日 下午10:36:49
	 */
	@RequestMapping(value = "/hello")
	public String home(Model model) throws Exception {
		
		User user = userService.findUserById(1);
		model.addAttribute("username", user.getName());
		
		return "home";
	}
	
}
