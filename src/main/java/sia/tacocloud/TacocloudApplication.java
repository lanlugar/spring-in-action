package sia.tacocloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "sia.tacocloud.*" })
public class TacocloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacocloudApplication.class, args);
	}

}
