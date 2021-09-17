package mainApp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import mainApp.dto.Hoteles;
import mainApp.service.HotelesServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/api")
public class HotelesController {

	@Autowired
	HotelesServiceImpl hotelesServiceImpl;
	
	//LISTAR TODOS LOS HOTELES
	@GetMapping("/hoteles")
	public List<Hoteles> listarHoteles(){
		return hotelesServiceImpl.listarHoteles();
	}
	/*
	@GetMapping("/hoteles/{nombre_hotel}")
	public List<Hoteles> listarHoteles(@PathVariable(name="nombre_hotel") String nombre_hotel){
		return hotelesServiceImpl.listarHotel(nombre_hotel);
	}
	*/
	
	
	
	//AÑADIR HOTELES
	@PostMapping("/hoteles")
	public Hoteles guardarHoteles(@RequestBody Hoteles hoteles) {
		return hotelesServiceImpl.guardarHoteles(hoteles);
	}
	
	//ACTUALIZAR HOTELES
	@PutMapping("/hoteles/{id_hotel}")
	public Hoteles actualizarHoteles(@PathVariable(name="id_hotel")int id_hotel, @RequestBody Hoteles hoteles) {
		Hoteles Hotel_Seleccionado = new Hoteles();
		Hoteles Hotel_Actualizado = new Hoteles();
		
		Hotel_Seleccionado = hotelesServiceImpl.BuscarID(id_hotel);
		
		Hotel_Seleccionado.setPrecio_reserva(hoteles.getPrecio_reserva());
		Hotel_Seleccionado.setNombre_hotel(hoteles.getNombre_hotel());
		
		Hotel_Actualizado= hotelesServiceImpl.actualizarHotel(Hotel_Seleccionado);
		
		return Hotel_Actualizado;
		
	}
	
	//ELIMINAR HOTEL
	@DeleteMapping("hoteles/{id_hotel}")
	public void eliminarHotel(@PathVariable(name="id_hotel")int id_hotel) {
		hotelesServiceImpl.eliminarHotel(id_hotel);
	}
		
	
}
