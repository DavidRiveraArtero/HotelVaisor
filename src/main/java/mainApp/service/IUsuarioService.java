package mainApp.service;

import java.util.List;
import mainApp.dto.Usuario;

public interface IUsuarioService {

	public List<Usuario> listarUsuarios();
	
	public Usuario BuscarID (int id);
	
	public Usuario GuardarUsuario(Usuario usuario);
	
	public void eliminarUsuario(int id);
	
	public Usuario actualizarUsuario(Usuario usuario);
	
}
