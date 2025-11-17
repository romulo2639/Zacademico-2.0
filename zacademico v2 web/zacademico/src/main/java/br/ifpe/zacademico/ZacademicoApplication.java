package br.ifpe.zacademico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.ifpe.zacademico.spring_boot", "br.ifpe.zacademico.model"})
public class ZacademicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZacademicoApplication.class, args);
	}

}
