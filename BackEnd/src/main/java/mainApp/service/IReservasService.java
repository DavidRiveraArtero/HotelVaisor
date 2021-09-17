package mainApp.service;

import java.util.List;

import mainApp.dto.Reservas;
public interface IReservasService {

	public List<Reservas> listarReservas();
	
	public Reservas BusacarID (int id_reserva);
	
	public Reservas AñadirReservas(Reservas reservas);
	
	public void eliminarReservas(int id_reserva);
	public Reservas actualizarReserva(Reservas reservas);
}
