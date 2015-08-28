package ro.asf.spring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component(value = "romanian")
@Profile("romanian")
public class RomanianService extends DefaultService {

	public String sayHello() {
		return "Buna ziua";
	}

}
