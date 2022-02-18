package es.dylanhurtado.chat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.dylanhurtado.chat.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
	
	public List<Usuario> findByUsername(String username);

}
