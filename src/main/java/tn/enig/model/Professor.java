package tn.enig.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String firstName;
	private String lastName;
	private String serialNumber;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public Professor(Integer id, String firstName, String lastName, String serialNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.serialNumber = serialNumber;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getFirstName() {
		return firstName;
	}public Integer getId() {
		return id;
	}
	public String getLastName() {
		return lastName;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
