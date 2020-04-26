package com.example.demo;
 
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	 
	
	@RequestMapping("hello")
	public String hello1()
	{
		return "hello god";
	}
	
	@RequestMapping("kkm")
	public String hello2()
	{
		return "kkm";
	}

}
