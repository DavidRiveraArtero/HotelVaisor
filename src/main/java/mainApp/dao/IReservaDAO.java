package mainApp.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Reservas;
public interface IReservaDAO  extends JpaRepository<Reservas, Integer>{

}
