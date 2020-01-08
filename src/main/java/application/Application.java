package application;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    static PropertySourcesPlaceholderConfigurer pspc(){
        return new PropertySourcesPlaceholderConfigurer();
    }


    @Configuration
    @Profile("dev")
    @PropertySource("dev.properties")
    public static class DevConfiguration{
        @Bean
        InitializingBean init(){
            System.out.println("dweqweqweqweqwe");
            return()->LogFactory.getLog(getClass()).info("dev initializing");

        }
    }


}
