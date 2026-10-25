package saude.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
