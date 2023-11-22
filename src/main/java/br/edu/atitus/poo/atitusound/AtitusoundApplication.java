package br.edu.atitus.poo.atitusound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "br.edu.atitus.poo.atitusound.entities")
@SpringBootApplication
public class AtitusoundApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtitusoundApplication.class, args);
				
	}

}
