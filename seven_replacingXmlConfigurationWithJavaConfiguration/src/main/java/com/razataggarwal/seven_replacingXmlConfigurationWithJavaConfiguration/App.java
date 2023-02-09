package com.razataggarwal.seven_replacingXmlConfigurationWithJavaConfiguration;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.razataggarwal.seven_replacingXmlConfigurationWithJavaConfiguration.model.Programmer;
import com.razataggarwal.seven_replacingXmlConfigurationWithJavaConfiguration.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        System.out.println("Using AnnotationBased IOC container to read configuration from @Configuration classes");
        User user1 = context.getBean("user",User.class);
        System.out.println(user1);
        User user2 = context.getBean("user",User.class);
        System.out.println(user2);
        @SuppressWarnings("unchecked")
		List<Programmer> programmers = context.getBean("programmers",List.class);
        System.out.println(programmers);
        context.close();
    }
}
