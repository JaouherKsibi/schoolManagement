package tn.enig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enig.dao.IProfessor;
import tn.enig.model.Professor;
@Service
public class ProfessorService implements IProfessorService{
	
	@Autowired
	private IProfessor professorDAO;
	public void setProfessorDAO(IProfessor professorDAO) {
		this.professorDAO = professorDAO;
	}
	public List<Professor> getAllProfessors() {
		return this.professorDAO.findAll();
	}

	public Professor getProfessorById(int id) {
		return this.professorDAO.findOne(id);
	}

	public void addProfessor(Professor p) {
		this.professorDAO.save(p);
	}

	public void updateProfessor(Professor p) {
		this.professorDAO.save(p);
	}

	public void deleteProfessorByID(int id) {
		this.professorDAO.delete(id);
	}

}
