package br.edu.atitus.poo.atitusound.dtos;

import lombok.Data;

@Data
public class AuthenticationRequestDTO{

    private String email;
    private String password;
    private String username;



}
