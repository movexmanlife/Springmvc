package com.robot.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * http://localhost:8080/Springmvc/view?path=index&contextPath=Springmvc
 *
 */
@Controller
public class MyController {
	@RequestMapping("/view")
	public ModelAndView view(HttpServletRequest request) {
		String path = request.getParameter("path") + "";
		ModelAndView mav = new ModelAndView();
		
		String contextPath = request.getContextPath();
		System.out.println(contextPath);
		/**
		 * 这种方式也是可以的
		 */
		// mav.addObject("contextPath", "http://localhost:8080" + contextPath);
		// mav.addObject("contextPath", contextPath); // 不需要加主机名也是可以的
		mav.addObject("contextPath", contextPath);
		mav.setViewName(path);
		return mav;
	}
}
