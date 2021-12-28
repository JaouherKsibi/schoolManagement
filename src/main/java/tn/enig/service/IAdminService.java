package tn.enig.service;

import java.util.List;

import tn.enig.model.Admin;

public interface IAdminService {
	public List<Admin> getAllAdmins();
	public Admin getAdminById(int id);
	public void addAdmin(Admin a);
	public void updateAdmin(Admin a);
	public void deleteAdminById(int id);
}
