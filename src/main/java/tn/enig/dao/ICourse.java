package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Course;
@Repository
public interface ICourse extends JpaRepository<Course, Integer> {

}
