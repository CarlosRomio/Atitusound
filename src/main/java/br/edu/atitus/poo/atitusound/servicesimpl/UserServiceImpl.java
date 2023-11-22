package br.edu.atitus.poo.atitusound.servicesimpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.poo.atitusound.entities.UserEntity;
import br.edu.atitus.poo.atitusound.repositories.GenericRepository;
import br.edu.atitus.poo.atitusound.repositories.UserRepository;
import br.edu.atitus.poo.atitusound.services.UserService;
@Service
public class UserServiceImpl implements UserService{
	
	private final UserRepository repository;
	
	UserServiceImpl(UserRepository repository){
		super();
		this.repository = repository;
	}
	@Override
	public GenericRepository<UserEntity> getRepository() {
		return repository;
	}

}
