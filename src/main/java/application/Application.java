package application;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


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

    @Configuration
    @Profile("prod")
    @PropertySource("prod.properties")
    public static class ProdConfiguration{

        @Bean
        InitializingBean init(){
            return ()-> LogFactory.getLog(getClass()).info("prod configuration initializing");
        }
    }
}


