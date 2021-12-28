package tn.enig.service;

import java.util.List;

import tn.enig.model.Course;

public interface ICourseService {
	public List<Course> getAllCourses();
	public Course getCourseByID(int id);
	public void addCourse(Course c);
	public void updateCourse(Course c);
	public void deleteCourseById(int id);

}
