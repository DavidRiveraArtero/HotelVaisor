package mainApp.dto;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {

	//CLAVE PRIMARIA ID_USUARIO
	@Id //CON EL @ID LE DECIMOS QUE SERA CLAVE PRIMARIA
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	//CON EL @COLUMN LE DECIMOS QUE SERA UNA COLUMNA DE TIPO STRING
	@Column(name="username")
	private String username;
	
	
	//COLUMNA EMAIL
	@Column(name="email")
	private String email;
	
	//COLUMNA CONTRASEÑA
	@Column(name="password")
	private String password;
	
	
	@OneToMany
	@JoinColumn(name="id_usuario")
	private List<Reservas> Reservas;
	

	
	//CONSTRUCTORES
	
	public Usuario() {
		
	}
	
	public Usuario(int id, String username, String email,String password) {
		this.id=id;
		this.username = username;
		this.email=email;
		this.password=password;
		
		
	}
	
	
	//GETTERS Y SETTERS

	
	


	public String getUsername() {
		return username;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", Reservas=" + Reservas + "]";
	}

	
	
	
	
	
	
	
	
}
