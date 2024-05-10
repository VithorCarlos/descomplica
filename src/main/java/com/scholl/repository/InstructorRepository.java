package com.scholl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scholl.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

}
