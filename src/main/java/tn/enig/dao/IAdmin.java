package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Admin;
@Repository
public interface IAdmin extends JpaRepository<Admin, Integer>{

}
