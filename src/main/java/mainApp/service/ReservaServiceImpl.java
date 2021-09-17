package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IReservaDAO;
import mainApp.dto.Reservas;

@Service
public class ReservaServiceImpl {
	@Autowired
	IReservaDAO iReservaDAO;
	
	//LISTAR RESERVAS
	public List<Reservas> listarReservas(){
		return iReservaDAO.findAll();
	}
	
	//LISTAR POR ID
	public Reservas BusacarID (int id_reserva) {
		return iReservaDAO.findById(id_reserva).get();
	}
	
	//AÑADIR NUEVAS RESERVAS
	public Reservas AñadirReservas(Reservas reservas) {
		return iReservaDAO.save(reservas);
	}
	
	//ELIMINAR RESERVAS
	public void eliminarReservas(int id_reserva) {
		iReservaDAO.findById(id_reserva);
	}
	
	//ACTUALIZAR RESERVA
	public Reservas actualizarReserva(Reservas reservas) {
		return iReservaDAO.save(reservas);
	}

}
