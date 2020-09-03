package com.myclass.controller;

import com.myclass.service.CourseService;
import com.myclass.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("details")
public class DetailController {

  @Autowired
  CourseService courseService;

  @Autowired
  TargetService targetService;

  @RequestMapping(value= "course", method = RequestMethod.GET)
  public String index(@RequestParam("id") int id, ModelMap model) {
    model.addAttribute("course", courseService.findById(id));
    System.out.println(targetService.findByCourseId(id).getTitle());
    String str = targetService.findByCourseId(id).getTitle();
    String[] lines = str.split("\\r?\\n");
    model.addAttribute("targets", lines);
    return "details/index";
  }
}
