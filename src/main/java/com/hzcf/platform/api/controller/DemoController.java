package com.hzcf.platform.api.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hzcf.platform.core.sys.service.DemoService;



/**
 * 
 * Description: 
 * @author baohongjian
 * 2017年2月27日
 *
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired 
	private DemoService demoService;

	@RequestMapping(value="/test")
	public Map test(HttpServletRequest request,HttpServletResponse response){
		Map<String,String> data = new HashMap<String,String>();
		System.out.println("请求DemoController");
		String str = demoService.get();
		data.put("success",str);
		return data;
	}



}
