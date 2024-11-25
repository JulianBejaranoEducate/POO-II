package co.edu.ue.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entity.TipoUsuario;

public interface ITipoUsuarioJpa extends JpaRepository<TipoUsuario, Integer>{
	
}