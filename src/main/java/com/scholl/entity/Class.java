package com.scholl.entity;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "class")
public class Class {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "time")
  private Time time;

  @Column(name = "duration")
  private Integer duration;

  @Column(name = "start_date")
  private Date start_date;

  @Column(name = "end_date")
  private Date end_date;

  @ManyToOne
  @JoinColumn(name = "instructor_id", referencedColumnName = "id")
  private Instructor instructor;

  public Integer getClassId() {
    return id;
  }

  public void setClassId(Integer id) {
    this.id = id;
  }

  public Time getTime() {
    return time;
  }

  public void setTime(Time time) {
    this.time = time;
  }

  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Date getStartDate() {
    return start_date;
  }

  public Date getEndDate() {
    return end_date;
  }
}
