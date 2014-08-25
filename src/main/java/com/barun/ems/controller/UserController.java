/**
 * 
 */
package com.barun.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.barun.ems.domain.User;

/**
 * @author Bibhuti
 *
 */
@Controller
public class UserController {
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String signIn(@RequestBody User user){
		if("bbarun".equals(user.getUserName()) && "August09".equals(user.getPassword())){
			return "redirect:resources/home.html";
		} else{
			return "redirect:resources/login.html";
		}
	}
}
