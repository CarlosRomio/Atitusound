package br.edu.atitus.poo.atitusound.dtos;

import lombok.Getter;

@Getter
public class ArtistDTO {
	
	private String name;
	
	private String image;

	public void setName(String name) {
		this.name = name;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
