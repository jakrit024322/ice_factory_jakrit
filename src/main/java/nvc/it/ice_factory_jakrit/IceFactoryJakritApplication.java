package nvc.it.ice_factory_jakrit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class IceFactoryJakritApplication {

	public static void main(String[] args) {
		SpringApplication.run(IceFactoryJakritApplication.class, args);
	}

}
