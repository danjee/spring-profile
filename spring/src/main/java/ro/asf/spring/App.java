package ro.asf.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
//		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "german");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("romanian");
		context.register(AppConfig.class);
        context.refresh();
        Client app = context.getBean(Client.class);
        System.out.println(app.test());
        context.close();
	}
}
