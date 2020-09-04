package com.myclass.controller;

import com.myclass.dto.VideoDto;
import com.myclass.service.CourseService;
import com.myclass.service.TargetService;
import com.myclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("details")
public class DetailController {

  @Autowired
  CourseService courseService;

  @Autowired
  TargetService targetService;

  @Autowired
  VideoService videoService;

  @RequestMapping(value= "course", method = RequestMethod.GET)
  public String index(@RequestParam("id") int id, ModelMap model) {
    List<VideoDto> videos = videoService.findAll();
    int totalTime = videoService.getTotalTime(videos);
    String str = targetService.findByCourseId(id).getTitle();
    String[] lines = str.split("\\r?\\n");
    model.addAttribute("course", courseService.findById(id));
    model.addAttribute("targets", lines);
    model.addAttribute("videos", videos);
    model.addAttribute("durations", totalTime);
    return "details/index";
  }
}
