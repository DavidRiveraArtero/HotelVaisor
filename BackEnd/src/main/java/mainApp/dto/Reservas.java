package mainApp.dto;
import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservas")
public class Reservas {

	//CLAVE PRIMARIA ID_RESERVA
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_reserva")
	private int id_reserva;
	
	//COLUMNA PRECIO RESERVA
	@Column(name="precio_reserva")
	private int precio_reserva;
	
	@Column(name="fecha_entrada")
	private Date fecha_entrada;
	
	@Column(name="fecha_salida")
	private Date fecha_salida;
	
	
	@ManyToOne
	@JoinColumn(name="id_usuario")
	Usuario id_usuario;
	
	@ManyToOne
	@JoinColumn(name="id_hotel")
	Hoteles id_hotel;
	
	
	//Constructor
	public Reservas() {
		
	}
	
	public Reservas (int id_reserva, int precio_reserva, Date fecha_entrada, Date fecha_salida, Usuario id_usuario, Hoteles id_hotel) {
		this.id_reserva=id_reserva;
		this.precio_reserva= precio_reserva;
		this.fecha_entrada=fecha_entrada;
		this.fecha_salida=fecha_salida;
		this.id_usuario=id_usuario;
		this.id_hotel=id_hotel;
		
	}

	//Getters y Setters
	public int getId_reserva() {
		return id_reserva;
	}

	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}

	public int getPrecio_reserva() {
		return precio_reserva;
	}

	public void setPrecio_reserva(int precio_reserva) {
		this.precio_reserva = precio_reserva;
	}

	public Date getFecha_entrada() {
		return fecha_entrada;
	}

	public void setFecha_entrada(Date fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}

	public Date getFecha_salida() {
		return fecha_salida;
	}

	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}

	public Usuario getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Hoteles getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(Hoteles id_hotel) {
		this.id_hotel = id_hotel;
	}

	//Metodo to String
	@Override
	public String toString() {
		return "Reservas [id_reserva=" + id_reserva + ", precio_reserva=" + precio_reserva + ", fecha_entrada="
				+ fecha_entrada + ", fecha_salida=" + fecha_salida + ", id_usuario=" + id_usuario + ", id_hotel="
				+ id_hotel + "]";
	}
	
	
	
	
	
	
}
