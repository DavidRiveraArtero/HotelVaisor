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
@Table(name="hoteles")
public class Hoteles {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_hotel;
	
	
	@Column(name="nombre_hotel")
	private String nombre_hotel;
	
	@Column(name="precio_reserva")
	private int precio_reserva;
	
	@Column(name="puntos_hoteles")
	private int puntos_hoteles;
	
	@Column(name="img_hotel")
	private String img_hotel;
		
	
	@OneToMany
	@JoinColumn(name="id_hotel")
	private List<Reservas> Reservas;
	
	/**
	 * @param id_hotel
	 * @param nombre_hotel
	 * @param precio_reserva
	 * @param puntos_hoteles
	 */
	
	//CONSTRUCTORES
	public Hoteles() {
		
	}
	
	public Hoteles (int id_hotel, String nombre_hotel, int precio_reserva, int puntos_hoteles, String img_hotel ) {
		this.id_hotel=id_hotel;
		this.nombre_hotel=nombre_hotel;
		this.precio_reserva=precio_reserva;
		this.puntos_hoteles=puntos_hoteles;
		this.img_hotel= img_hotel;
	}

	//GETTERS Y SETTERS
	public int getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(int id_hotel) {
		this.id_hotel = id_hotel;
	}

	
	public String getNombre_hotel() {
		return nombre_hotel;
	}

	public void setNombre_hotel(String nombre_hotel) {
		this.nombre_hotel = nombre_hotel;
	}

	public int getPrecio_reserva() {
		return precio_reserva;
	}

	public void setPrecio_reserva(int precio_reserva) {
		this.precio_reserva = precio_reserva;
	}

	public int getPuntos_hoteles() {
		return puntos_hoteles;
	}

	public void setPuntos_hoteles(int puntos_hoteles) {
		this.puntos_hoteles = puntos_hoteles;
	}
	


	public String getImg_hotel() {
		return img_hotel;
	}

	public void setImg_hotel(String img_hotel) {
		this.img_hotel = img_hotel;
	}
	
	//METODO TOSTRING


	@Override
	public String toString() {
		return "Hoteles [id_hotel=" + id_hotel + ", nombre_hotel=" + nombre_hotel + ", precio_reserva=" + precio_reserva
				+ ", puntos_hoteles=" + puntos_hoteles + ", img_hotel=" + img_hotel + ", Reservas=" + Reservas + "]";
	}
	
	
	
	
	
	
	
	
	
}
