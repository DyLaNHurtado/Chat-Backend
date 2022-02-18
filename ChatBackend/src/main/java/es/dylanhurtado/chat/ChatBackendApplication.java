package es.dylanhurtado.chat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.dylanhurtado.chat.model.Usuario;
import es.dylanhurtado.chat.repository.UsuarioRepository;

@SpringBootApplication
public class ChatBackendApplication implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	public static void main(String[] args) {
		SpringApplication.run(ChatBackendApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Ejecucion del metodo run..");
		usuarioRepository.save(new Usuario(null,"admin","admin"));
		usuarioRepository.findByUsername("admin");
		List<Usuario> listaUsuarios= usuarioRepository.findByUsername("admin");
		listaUsuarios.forEach(x->{System.out.println(x.getPassword());});
	}

}
