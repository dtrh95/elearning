package com.myclass.service.impl;

import com.myclass.dto.VideoDto;
import com.myclass.entity.Video;
import com.myclass.repository.VideoRepository;
import com.myclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(rollbackOn = Exception.class)
public class VideoServiceImpl implements VideoService {
  @Autowired
  VideoRepository videoRepository;

  @Override
  public List<VideoDto> findAll() {
    List<VideoDto> dtos = new ArrayList<>();
    List<Video> videos = videoRepository.findAll();
    for (Video video: videos) {
      video.getVideoLength();
      dtos.add(new VideoDto(video.getId(), video.getTitle(), video.getUrl(), video.getTimeCount()));
    }
    return dtos;
  }

  @Override
  public int getTotalTime(List<VideoDto> videos) {
    int count = 0;
    for (VideoDto video : videos) {
      count += video.getTimeCount();
    }
    return count;
  }
}
