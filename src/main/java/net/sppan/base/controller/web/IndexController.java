package net.sppan.base.controller.web;

import java.util.List;

import net.sppan.base.controller.BaseController;
import net.sppan.base.entity.User;
import net.sppan.base.service.IUserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController extends BaseController{
	
	@Autowired
	private IUserService userService;
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping(value={"/","/index"})
	public String index(){
		List<User> users = userService.findAll();
		logger.debug(users.toString());
		return "index";
	}
}
