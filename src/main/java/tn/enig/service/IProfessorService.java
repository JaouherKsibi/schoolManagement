package tn.enig.service;

import java.util.List;

import tn.enig.model.Professor;

public interface IProfessorService {
	public List<Professor> getAllProfessors();
	public Professor getProfessorById(int id);
	public void addProfessor(Professor p);
	public void updateProfessor(Professor p);
	public void deleteProfessorByID(int id);
}
