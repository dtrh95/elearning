package com.myclass.service.impl;

import com.myclass.dto.TargetDto;
import com.myclass.entity.Target;
import com.myclass.repository.TargetRepository;
import com.myclass.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TargetServiceImpl implements TargetService {

  @Autowired
  TargetRepository targetRepository;
  @Override
  public List<TargetDto> findAll() {
    List<TargetDto> dtos = new ArrayList<>();

    List<Target> targets = targetRepository.findAll();
    for (Target target : targets) {
      dtos.add(new TargetDto(target.getId(), target.getTitle(), target.getCourseId()));
    }
    return dtos;
  }
}
