package com.scholl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.scholl.entity.Class;

public interface ClassRepository extends JpaRepository<Class, Integer> {

}
