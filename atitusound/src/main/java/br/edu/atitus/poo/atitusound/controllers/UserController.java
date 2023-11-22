package br.edu.atitus.poo.atitusound.controllers;


import br.edu.atitus.poo.atitusound.dtos.UserDTO;
import br.edu.atitus.poo.atitusound.entities.UserEntity;
import br.edu.atitus.poo.atitusound.services.GenericService;

public class UserController extends GenericController<UserEntity, UserDTO> {


	@Override
	protected GenericService<UserEntity> getService() {
		return null;
	}

	@Override
	protected UserEntity convertDTO2Entity(UserDTO userDTO) {
		return null;
	}
}
