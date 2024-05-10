package com.scholl.entity;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "instructor")
public class Instructor {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "rg", unique = true)
  private Integer rg;

  @Column(name = "name")
  private String name;

  @Column(name = "birth")
  private Date birth;

  @Column(name = "titration")
  private String titration;

  @OneToMany(mappedBy = "instructor")
  private Set<Class> classes;
}
