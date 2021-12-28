package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Professor;
@Repository
public interface IProfessor extends JpaRepository<Professor, Integer>{

}
