package br.edu.atitus.poo.atitusound.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;


@Table(name = "tb_user")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity extends GenericEntity{

	@Getter
	private String email;
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