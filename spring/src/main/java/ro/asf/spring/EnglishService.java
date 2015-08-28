package ro.asf.spring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class EnglishService extends DefaultService {

	public String sayHello() {
		return "Good day";
	}
}
