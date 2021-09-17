package mainApp.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Hoteles;

public interface IHotelesDAO extends JpaRepository<Hoteles, Integer>{
	//public List <Hoteles> findByHotel(String nombre_hotel);
}
