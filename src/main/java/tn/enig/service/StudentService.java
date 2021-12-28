package tn.enig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enig.dao.IStudent;
import tn.enig.model.Student;
@Service
public class StudentService implements IStudentService {
	@Autowired
	private IStudent studentDAO;
	public void setStudentDAO(IStudent studentDAO) {
		this.studentDAO = studentDAO;
	}
	public List<Student> getAllStudents() {
		return this.studentDAO.findAll();
	}

	public Student getStudentById(int id) {
		return this.studentDAO.findOne(id);
	}

	public void addStudent(Student s) {
		this.studentDAO.save(s);
	}

	public void updateStudent(Student s) {
		this.studentDAO.save(s);
	}

	public void deleteStudentById(int id) {
		this.studentDAO.delete(id);
	}

}
