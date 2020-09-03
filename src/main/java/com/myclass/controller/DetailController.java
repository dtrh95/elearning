package com.myclass.controller;

import com.myclass.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("details")
public class DetailController {

  @Autowired
  CourseService courseService;

  @RequestMapping(value= "course", method = RequestMethod.GET)
  public String index(@RequestParam("id") int id, ModelMap model) {
    model.addAttribute("course", courseService.findById(id));
    return "details/index";
  }
}
