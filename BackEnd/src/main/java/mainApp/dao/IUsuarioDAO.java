package mainApp.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import mainApp.dto.Usuario;
public interface IUsuarioDAO  extends JpaRepository<Usuario, Integer>{
	//Usuario findByUsername(String username);


}
