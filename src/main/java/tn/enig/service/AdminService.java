package tn.enig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.enig.dao.IAdmin;
import tn.enig.model.Admin;

@Service
public class AdminService implements IAdminService{

	@Autowired
	private IAdmin adminDAO;
	public void setAdminDAO(IAdmin adminDAO) {
		this.adminDAO = adminDAO;
	}
	
	
	public void addAdmin(Admin a) {
		this.adminDAO.save(a);
	}
	
	public List<Admin> getAllAdmins(){
		return this.adminDAO.findAll();
	}
	
	public Admin getAdminById(int id) {
		return this.adminDAO.findOne(id);
	}
	
	public void deleteAdminById(int id) {
		this.adminDAO.delete(id);
	}
	
	public void updateAdmin(Admin a) {
		this.adminDAO.save(a);
	}
	
	
}
