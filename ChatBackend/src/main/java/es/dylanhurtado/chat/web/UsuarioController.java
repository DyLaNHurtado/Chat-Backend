package es.dylanhurtado.chat.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import es.dylanhurtado.chat.model.Usuario;
import es.dylanhurtado.chat.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public List<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuarios/{id}")
	public Optional<Usuario> findById(@PathVariable Long id){
		return usuarioRepository.findById(id);
	}

}
