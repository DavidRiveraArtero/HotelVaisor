package mainApp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IHotelesDAO;

import mainApp.dto.Hoteles;

@Service
public class HotelesServiceImpl{

	@Autowired
	IHotelesDAO iHotelesDAO;
	
	//LISTAR TODOS LOS HOTELES
	public List<Hoteles> listarHoteles(){
		return iHotelesDAO.findAll();
	}
	
	/*
	public List<Hoteles> listarHotel(String nombre_hotel){
		return iHotelesDAO.findByHotel(nombre_hotel);
	}
	*/
	
	//LISTAR POR ID
	public Hoteles BuscarID(int id_hotel) {
		return iHotelesDAO.findById(id_hotel).get();
	}
	
	
	//GuardarHoteles
	public Hoteles guardarHoteles(Hoteles hoteles) {
		return iHotelesDAO.save(hoteles);
	}
	
	public Hoteles actualizarHotel(Hoteles hoteles) {
		return iHotelesDAO.save(hoteles);
	}
	
	public void eliminarHotel(int id_hotel) {
		iHotelesDAO.deleteById(id_hotel);
	}
}
