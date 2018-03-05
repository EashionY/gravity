package com.mistytech.gravity.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mistytech.gravity.entity.User;
import com.mistytech.gravity.service.UserService;
import com.mistytech.gravity.util.JsonResult;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;
	
	private JsonResult regist(User user) {
	
	}
	
}
