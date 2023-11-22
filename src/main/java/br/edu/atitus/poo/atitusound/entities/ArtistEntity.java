package br.edu.atitus.poo.atitusound.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "tb_artist")
public class ArtistEntity extends GenericEntity{
	
	private String image;

	public void setImage(String image) {
		this.image = image;
	}

	
	
}
