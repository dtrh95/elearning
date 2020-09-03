package com.myclass.service;

import com.myclass.dto.TargetDto;

import java.util.List;

public interface TargetService {
  List<TargetDto> findAll();
  TargetDto findByCourseId(int id);
}
