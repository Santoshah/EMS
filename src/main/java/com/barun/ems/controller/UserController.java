/**
 * 
 */
package com.barun.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.barun.ems.domain.User;

/**
 * @author Bibhuti
 *
 */
@RestController
public class UserController {
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public @ResponseBody boolean signIn(@RequestBody User user){
		if("bbarun".equals(user.getUserName()) && "August09".equals(user.getPassword())){
			return true;
		} else{
			return false;
		}
	}
}
