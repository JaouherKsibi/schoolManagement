package tn.enig.service;

import java.util.List;

import tn.enig.model.Student;

public interface IStudentService {
	public List<Student> getAllStudents();
	public Student getStudentById(int id);
	public void addStudent(Student s);
	public void updateStudent(Student s);
	public void deleteStudentById(int id);
}
