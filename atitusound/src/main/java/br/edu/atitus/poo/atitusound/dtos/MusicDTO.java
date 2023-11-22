package br.edu.atitus.poo.atitusound.dtos;

import lombok.Getter;

import java.time.Duration;

@Getter
public class MusicDTO {

	private String name;
	
	private Duration duration;
	
	private String url;
	
	private OnlyUuidDTO artist;

	public void setName(String name) {
		this.name = name;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setArtist(OnlyUuidDTO artist) {
		this.artist = artist;
	}

	
}
