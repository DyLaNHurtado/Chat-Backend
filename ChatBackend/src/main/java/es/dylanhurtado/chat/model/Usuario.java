package es.dylanhurtado.chat.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="username" ,length=25)
	private String username;
	@Column(name="password" ,length=25)
	private String password;

	
	public Usuario(Long id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	 
	
	public Usuario() {
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Usuario {id=" + id + ","
				+ " username=" + username +
				", password=" + password + "}";
	}
	
	
	
	
	
}
