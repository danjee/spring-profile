package ro.asf.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Client {
	
	@Autowired
	private Service service;
	
	public String test(){
		return service.sayHello();
	}
	
}
