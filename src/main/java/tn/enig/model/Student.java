package tn.enig.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String firstnName;
	private String lastName;
	private String cin;
	private String login;
	private String password;
	@ManyToOne
	@JoinColumn(name = "groupe", referencedColumnName = "id")
	private Groupe groupe;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(Integer id, String firstnName, String lastName, String cin, String login, String password,
			Groupe groupe) {
		super();
		this.id = id;
		this.firstnName = firstnName;
		this.lastName = lastName;
		this.cin = cin;
		this.login = login;
		this.password = password;
		this.groupe = groupe;
	}


	public Integer getId() {
		return id;
	}
	public String getFirstnName() {
		return firstnName;
	}
	public Groupe getGroupe() {
		return groupe;
	}
	public String getLastName() {
		return lastName;
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public void setFirstnName(String firstnName) {
		this.firstnName = firstnName;
	}
	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
