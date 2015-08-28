package ro.asf.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "ro.asf.spring")
@PropertySource("classpath:app.properties")
public class AppConfig {
 
	
	
	
}