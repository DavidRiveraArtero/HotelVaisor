package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Reservas;
import mainApp.service.ReservaServiceImpl;

@RestController
@RequestMapping("/api")
public class ReservasController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	//LISTAR TODAS LAS RESERVAS
	@GetMapping("/reservas")
	public List<Reservas> listarReservas(){
		return reservaServiceImpl.listarReservas();
	}
	
	//AÑADIR NUEVAS RESERVAS
	@PostMapping("/reservas")
	public Reservas añadirReservas(@RequestBody Reservas reservas) {
		return reservaServiceImpl.AñadirReservas(reservas);
	}
	
	//ACTUALIZAR RESERVA
	@PutMapping 
	public Reservas actualizarReserva(@PathVariable(name="id_reserva")int id_reserva, @RequestBody Reservas reservas) {
		Reservas Reserva_Seleccionada = new Reservas();
		Reservas Reserva_Actualizada = new Reservas();
		
		Reserva_Seleccionada = reservaServiceImpl.BusacarID(id_reserva);
		
		Reserva_Seleccionada.setId_hotel(reservas.getId_hotel());
		Reserva_Seleccionada.setPrecio_reserva(reservas.getPrecio_reserva());
		
		Reserva_Actualizada= reservaServiceImpl.actualizarReserva(Reserva_Seleccionada);
		
		return Reserva_Actualizada;
		
	}
	
	//ELIMINAR RESERVA
	@DeleteMapping("reservas/{id_reserva}")
	public void eliminarReserva(@PathVariable(name="id_reserva")int id_reserva) {
		reservaServiceImpl.eliminarReservas(id_reserva);
	}
}
