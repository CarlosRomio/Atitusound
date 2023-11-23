package br.edu.atitus.poo.atitusound.controllers;

import br.edu.atitus.poo.atitusound.Security.TokenService;
import br.edu.atitus.poo.atitusound.dtos.AuthenticationRequestDTO;
import br.edu.atitus.poo.atitusound.entities.UserEntity;
import br.edu.atitus.poo.atitusound.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping("Auth")
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final TokenService tokenService;

    public AuthenticationController(AuthenticationManager authenticationManager, UserRepository userRepository, TokenService tokenService){

        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
        this.userRepository = userRepository;

    }
    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody AuthenticationRequestDTO authenticationRequestDTO){

        var usernamePassword = new UsernamePasswordAuthenticationToken(authenticationRequestDTO.getEmail(), authenticationRequestDTO.getPassword());
        var auth = authenticationManager.authenticate(usernamePassword);
        var token = tokenService.generateToken((UserEntity) auth.getPrincipal());
        return ResponseEntity.ok(token);
    }

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody AuthenticationRequestDTO authenticationRequestDTO){

        if(userRepository.findByEmail(authenticationRequestDTO.getEmail()) != null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(authenticationRequestDTO.getPassword());
        UserEntity user = new UserEntity(authenticationRequestDTO.getEmail(), authenticationRequestDTO.getUsername(), encryptedPassword, "Admin");

        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
}
