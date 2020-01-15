package application.config;

import application.entities.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "application.repositories.locdevDB",
        entityManagerFactoryRef = "locdevEntityManagerFactory",
        transactionManagerRef = "locdevTransactionManager")
public class LocdevDBConfig {

    @Bean
    @Primary
    @ConfigurationProperties("datasource.locdev")
    public DataSourceProperties locdevDataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    @ConfigurationProperties("datasource.locdev.configuration")
    public DataSource locdevDataSource(){
        return locdevDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Primary
    @Bean(name = "locdevEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean locdevEntityManagerFactory(EntityManagerFactoryBuilder builder){
        return builder.dataSource(locdevDataSource()).packages(Product.class).build();
    }

    @Primary
    @Bean
    public PlatformTransactionManager locdevTransactionManager(
            final @Qualifier("locdevEntityManagerFactory") LocalContainerEntityManagerFactoryBean locdevEntityManagerFactory){
        return new JpaTransactionManager(locdevEntityManagerFactory.getObject());
    }


}
