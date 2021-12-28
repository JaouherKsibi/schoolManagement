package tn.enig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enig.dao.ICourse;
import tn.enig.model.Course;
@Service
public class CourseManagementService implements ICourseService{
	@Autowired
	ICourse courseDAO;
	public void setCourseDAO(ICourse courseDAO) {
		this.courseDAO = courseDAO;
	}
	public List<Course> getAllCourses() {
		return this.courseDAO.findAll();
	}

	public Course getCourseByID(int id) {
		return this.courseDAO.findOne(id);
	}

	public void addCourse(Course c) {
		this.courseDAO.save(c);
	}

	public void updateCourse(Course c) {
		this.courseDAO.save(c);
	}

	public void deleteCourseById(int id) {
		this.courseDAO.delete(id);
	}

	
}
