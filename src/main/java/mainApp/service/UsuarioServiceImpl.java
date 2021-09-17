package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IUsuarioDAO;
import mainApp.dto.Usuario;

@Service
public class UsuarioServiceImpl {

	@Autowired
	IUsuarioDAO iUsuarioDAO;
	
	//LISTAR TODOS LOS USUARIOS
	public List<Usuario> listarUsuarios(){
		return iUsuarioDAO.findAll();
	}
	
	//LISTAR POR ID
	public Usuario BuscarID (int id) {
		return iUsuarioDAO.findById(id).get();    
	}
	
	//GUARDAR NUEVOS USUARIOS
	public Usuario GuardarUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}
	
	//ELIMINAR USUARIO
	public void eliminarUsuario(int id) {
		iUsuarioDAO.findById(id);
	}
	
	//ACTUALIZAR USUARIO
	public Usuario actualizarUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}
}
