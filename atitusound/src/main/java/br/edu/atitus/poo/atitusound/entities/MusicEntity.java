package br.edu.atitus.poo.atitusound.entities;

import java.time.Duration;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "tb_music")
public class MusicEntity extends GenericEntity{

	private Duration duration;
	private String url;
	private Integer likesCount;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "artist_uuid", nullable = false)
	private ArtistEntity artist;

	public void setArtist(ArtistEntity artist) {
		this.artist = artist;
	}


	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
