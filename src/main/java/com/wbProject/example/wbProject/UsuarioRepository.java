package com.wbProject.example.wbProject;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByNome(String email, String senha);
}