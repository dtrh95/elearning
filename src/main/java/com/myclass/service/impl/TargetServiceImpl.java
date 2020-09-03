package com.myclass.service.impl;

import com.myclass.dto.TargetDto;
import com.myclass.entity.Target;
import com.myclass.repository.TargetRepository;
import com.myclass.service.TargetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(rollbackOn = Exception.class)
public class TargetServiceImpl implements TargetService {

  @Autowired
  TargetRepository targetRepository;

  @Override
  public List<TargetDto> findAll() {
    List<TargetDto> dtos = new ArrayList<>();

    List<Target> targets = targetRepository.findAll();
    for (Target target : targets) {
      dtos.add(new TargetDto(target.getId(), target.getTitle(), target.getCourseId(), target.getCourse()));
    }
    return dtos;
  }

  @Override
  public TargetDto findByCourseId(int id) {
    System.out.println("findbycourseid : " + id );
    TargetDto target = new TargetDto();
    List<Target> list = targetRepository.findAll();
    for (Target item : list) {
      if (item.getCourseId() == id) {
        target.setId(item.getId());
        target.setCourseId(item.getCourseId());
        target.setTitle(item.getTitle());
        break;
      }
    }
    return target;
  }
}
