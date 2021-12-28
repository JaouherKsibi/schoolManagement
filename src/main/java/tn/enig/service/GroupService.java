package tn.enig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enig.dao.IGroupe;
import tn.enig.model.Groupe;

@Service
public class GroupService implements IGroupeService {
	@Autowired
	private IGroupe groupDAO;
	public void setGroupDAO(IGroupe groupDAO) {
		this.groupDAO = groupDAO;
	}
	public List<Groupe> getAllGroups() {
		return this.groupDAO.findAll();
	}

	public Groupe getGroupById(int id) {
		return this.groupDAO.findOne(id);
	}

	public void addGroup(Groupe gp) {
		this.groupDAO.save(gp);
	}

	public void updateGroup(Groupe gp) {
		this.groupDAO.save(gp);
	}

	public void deleteGroupByID(int id) {
		this.groupDAO.delete(id);
	}

}
