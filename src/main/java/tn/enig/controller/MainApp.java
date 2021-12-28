package tn.enig.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import tn.enig.dao.IProfessor;
import tn.enig.model.Course;
import tn.enig.model.Groupe;
import tn.enig.model.Professor;
import tn.enig.model.Student;
import tn.enig.service.AdminService;
import tn.enig.service.IAdminService;
import tn.enig.service.ICourseService;
import tn.enig.service.IGroupeService;
import tn.enig.service.IProfessorService;
import tn.enig.service.IStudentService;
@Controller
public class MainApp {
	@Autowired
	IAdminService serviceAdmin;
	public void setI(AdminService i) {
		this.serviceAdmin = i;
	}
	
	@Autowired
	IProfessorService professorService;
	public void setProfessor(IProfessorService professor) {
		this.professorService = professor;
	}
	
	@Autowired
	private ICourseService courceService;
	public void setCourceService(ICourseService courceService) {
		this.courceService = courceService;
	}
	
	@Autowired
	private IGroupeService groupService;
	public void setGroupService(IGroupeService groupService) {
		this.groupService = groupService;
	}
	@Autowired
	private IStudentService studentService;
	public void setServiceAdmin(IAdminService serviceAdmin) {
		this.serviceAdmin = serviceAdmin;
	}
	
	@GetMapping("home")
	public String home(Model m) {
		m.addAttribute("listeAdmins",this.serviceAdmin.getAllAdmins());
		m.addAttribute("liste", this.groupService.getAllGroups());
		m.addAttribute("listeCourse", this.courceService.getAllCourses());
		m.addAttribute("listeProf", this.professorService.getAllProfessors());
		m.addAttribute("listeStudent", studentService.getAllStudents());
		

		return "home";
	}
	
	
	

}
