package br.edu.atitus.poo.atitusound.repositories;

import org.springframework.security.core.userdetails.UserDetails;

import br.edu.atitus.poo.atitusound.entities.UserEntity;

public interface UserRepository extends GenericRepository<UserEntity>{

	UserDetails findByEmail(String email);

}
