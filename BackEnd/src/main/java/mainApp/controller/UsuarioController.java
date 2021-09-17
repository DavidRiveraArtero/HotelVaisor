package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.Usuario;
import mainApp.service.UsuarioServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api")
public class UsuarioController {
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;

	// LISTAR TODOS LOS USUARIOS
	@GetMapping("/usuario")
	public List<Usuario> listarUsuario() {
		return usuarioServiceImpl.listarUsuarios();
	}

	// AÑADIR USUARIO
	
	@PostMapping("/usuario")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImpl.GuardarUsuario(usuario);
	}

	// ACTUALIZAR USUARIO
	@PutMapping("/usuario/{id}")
	public Usuario actualizarUsuario(@PathVariable(name = "id") int id, @RequestBody Usuario usuario) {
		Usuario Usuario_Seleccionado = new Usuario();
		Usuario Usuario_Actualizado = new Usuario();

		Usuario_Seleccionado = usuarioServiceImpl.BuscarID(id);

		Usuario_Seleccionado.setPassword(usuario.getPassword());
		Usuario_Seleccionado.setEmail(usuario.getEmail());

		Usuario_Actualizado = usuarioServiceImpl.actualizarUsuario(Usuario_Seleccionado);

		return Usuario_Actualizado;

	}

	// ELIMINAR USUARIO
	@DeleteMapping("usuario/{id}")
		public void eliminarUsuario(@PathVariable(name="id")int id) {
			usuarioServiceImpl.eliminarUsuario(id);
}
}

