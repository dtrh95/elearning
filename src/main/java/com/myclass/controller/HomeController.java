package com.myclass.controller;

import com.myclass.dto.CategoryDto;
import com.myclass.service.CategoryService;
import com.myclass.service.CourseService;
import com.myclass.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {
	@Autowired
	CategoryService categoryService;

	@Autowired
	CourseService courseService;
	@RequestMapping(value = "",method = RequestMethod.GET)
	public String index(ModelMap model) {
		List<CategoryDto> list = categoryService.findAll();
		model.addAttribute("category", list);
		model.addAttribute("course", courseService.findAll());
		return "home/index";
	}
}
