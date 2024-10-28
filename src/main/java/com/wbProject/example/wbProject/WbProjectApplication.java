package com.wbProject.example.wbProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class WbProjectApplication {


	@Autowired
	private UsuarioManager usuarioManager;
	public static void main(String[] args) {
		
		SpringApplication.run(WbProjectApplication.class, args);

	}
	@PostConstruct
    public void addInitialUser() {
        Usuario user = new Usuario(1,"Carlos", "bertunesgabriel6", "bertunes");
        usuarioManager.adicionarUsuario(user);
        System.out.println("Usuário adicionado: " + user.getNome());
    }

}
