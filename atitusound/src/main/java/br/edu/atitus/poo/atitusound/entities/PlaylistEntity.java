package br.edu.atitus.poo.atitusound.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_playlist")
public class PlaylistEntity extends GenericEntity{
	
	@ManyToMany
	private List<MusicEntity> musics_id;
	private String publicShare;
	@ManyToOne
	private UserEntity user;

	public List<MusicEntity> getMusics() {
		return musics_id;
	}
	public void setMusics(List<MusicEntity> musics) {
		this.musics_id = musics;
	}

	public void setPublicShare(String publicShare) {
		this.publicShare = publicShare;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}
	
	
}
