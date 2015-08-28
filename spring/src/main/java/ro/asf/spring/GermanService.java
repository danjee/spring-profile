package ro.asf.spring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("german")
public class GermanService extends DefaultService {

	public String sayHello() {
		return "Gutten tag";
	}

}
