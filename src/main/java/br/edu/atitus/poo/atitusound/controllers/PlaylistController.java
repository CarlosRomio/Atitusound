package br.edu.atitus.poo.atitusound.controllers;

import br.edu.atitus.poo.atitusound.dtos.PlaylistDTO;
import br.edu.atitus.poo.atitusound.entities.PlaylistEntity;
import br.edu.atitus.poo.atitusound.services.GenericService;

public class PlaylistController extends GenericController<PlaylistEntity, PlaylistDTO>{

	@Override
	protected GenericService<PlaylistEntity> getService() {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
	protected PlaylistEntity convertDTO2Entity(PlaylistDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
