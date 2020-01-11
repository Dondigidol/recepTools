package application;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Configuration
    @Profile("dev")
    @PropertySource("dev.properties")
    public static class DevConfiguration{

        @Bean
        InitializingBean init(){
            return ()-> LogFactory.getLog(getClass()).info("dev configuration initializing");
        }

    }
}


