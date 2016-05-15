package ma.jemla.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import com.sun.istack.internal.NotNull;



@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public class Account implements Serializable{
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String password;
	private String conf_pass;
	@NotNull
	@Column(nullable=false)
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConf_pass() {
		return conf_pass;
	}
	public void setConf_pass(String conf_pass) {
		this.conf_pass = conf_pass;
	}
	
	
	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(String name, String password, String conf_pass) {
		super();
		this.name = name;
		this.password = password;
		this.conf_pass = conf_pass;
	}
	

}
