package pl.dmcs.projektkompetencyjny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
//@ImportResource("classpath:config/spring-config.xml")
@EnableScheduling
public class ProjektkompetencyjnyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektkompetencyjnyApplication.class, args);
	}
}
