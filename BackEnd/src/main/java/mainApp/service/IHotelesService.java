package mainApp.service;

import java.util.List;


import mainApp.dto.Hoteles;

public interface IHotelesService {

	public List<Hoteles> listarHoteles();
	
	//public List<Hoteles> listartHotel(String nombre_hotel);
	
	public Hoteles BuscarID(int id_hotel);
	
	
	public Hoteles guardarHoteles(Hoteles hoteles);
	
	public Hoteles actualizarHotel(Hoteles hoteles);
	
	public void eliminarHotel(int id_hotel);
}
