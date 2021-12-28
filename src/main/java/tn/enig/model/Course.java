package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Integer id;
	
	private String name;
	@ManyToOne
	@JoinColumn(name = "professor" , referencedColumnName = "id")
	private Professor professor;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(Integer id, String name, Professor professor) {
		super();
		this.id = id;
		this.name = name;
		this.professor = professor;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	} 
	public Professor getProfessor() {
		return professor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
