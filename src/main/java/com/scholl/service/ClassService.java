package com.scholl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scholl.repository.ClassRepository;
import com.scholl.entity.Class;

@Service
public class ClassService {
  @Autowired
  ClassRepository classRepository;

  public List<Class> getAll() {
    return classRepository.findAll();
  }

  public Class saveClass(Class data) {
    return classRepository.save(data);
  }

}
