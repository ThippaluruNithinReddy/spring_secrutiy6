package spring.security.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@Column
	private Integer id;
	@Column
	private String userName;
	@Column
	private String password;
	
	
	public Integer getId() {
		return id;
	}
	public User(Integer id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	

}
