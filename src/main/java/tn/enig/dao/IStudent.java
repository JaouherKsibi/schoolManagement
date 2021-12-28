package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Student;
@Repository
public interface IStudent extends JpaRepository<Student, Integer> {

}
