package com.sword.ocean.admin.web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.sword.ocean.web.utils.BaseController;

@Controller
public class Admin extends BaseController {
	
	@RequestMapping(value="data")
	@ResponseBody
	public JSONObject indicator(HttpServletRequest request){
		JSONObject object = renderFailed("sword ok"); 
		return object;
//		return null;
	}
	
	@RequestMapping(value="test")
	@ResponseBody
	public String test(HttpServletRequest request){
		return "hello sword";
	}
}
