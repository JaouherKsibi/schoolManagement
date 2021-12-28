package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Groupe;
@Repository
public interface IGroupe extends JpaRepository<Groupe, Integer> {

}
