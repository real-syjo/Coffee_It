package src.com.coffee.domain.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("src.com.coffee.domain.*")
public class CoffeeItApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeItApplication.class, args);
	}

}
