package org.koreait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Jpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(Jpa1Application.class, args);
	}

}
