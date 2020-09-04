package com.myclass.service;

import com.myclass.dto.VideoDto;

import java.util.List;

public interface VideoService {
  List<VideoDto> findAll();
  int getTotalTime(List<VideoDto> videos);
}
