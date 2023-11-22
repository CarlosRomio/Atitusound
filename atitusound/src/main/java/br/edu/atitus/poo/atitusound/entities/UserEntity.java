package br.edu.atitus.poo.atitusound.entities;

import lombok.Getter;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Table(name = "tb_user")
@Entity
public class UserEntity extends GenericEntity{

	@Getter
	private String email;
	@Getter
	private String username;
	private String password;
	private String role;

	public void setEmail(String email) {
		this.email = email;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}



}