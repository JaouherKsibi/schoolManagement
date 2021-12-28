package tn.enig.service;

import java.util.List;

import tn.enig.model.Groupe;

public interface IGroupeService {
	public List<Groupe> getAllGroups();
	public Groupe getGroupById(int id);
	public void addGroup(Groupe gp);
	public void updateGroup(Groupe gp);
	public void deleteGroupByID(int id);

}
