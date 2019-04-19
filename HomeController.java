package in.co.codeplanet.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import in.co.codeplanet.dao.Dao;
import in.co.codeplanet.service.HomeService;

@Controller

public class HomeController {
    @Autowired
    HomeService hs;
    
    
	@RequestMapping(value="/")
	public String home()
	{
		return "index";
	}
	@RequestMapping(value="xyz")
	public String register()
	{
		return "register";
	}
	@RequestMapping(value="registered")
	public String registered(HttpServletRequest req)
	{
		String name=req.getParameter("name");
		String username=req.getParameter("username");
		
		hs.getUserDetails(name,username);

		
		return "index";
	}
	
	
}
