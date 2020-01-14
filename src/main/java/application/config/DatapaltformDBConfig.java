package application.config;

import application.entities.OrderInfo;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "application.repositories.dataplatform",
        entityManagerFactoryRef = "dataplatformEntityManagerFactory",
        transactionManagerRef = "dataplatformTransactionManager")
public class DatapaltformDBConfig {

    @Bean
    @ConfigurationProperties("datasource.dataplatform")
    public DataSourceProperties datapldatformDataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    @ConfigurationProperties("datasource.dataplatform.configuration")
    public DataSource dataplatformDataSource(){
        return datapldatformDataSourceProperties()
                .initializeDataSourceBuilder()
                    .url("jdbc:postgresql://gp.data.lmru.tech:5432/adb")
                    .username("p-pallet-usr-1")
                    .password("P^Mp4.hp+@'mK'MG6vAW")
                .build();
    }

    @Bean(name = "dataplatformEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean dataplatformEntityManagerFactory(EntityManagerFactoryBuilder builder){
        return builder
                .dataSource(dataplatformDataSource())
                .packages(OrderInfo.class)
                .build();
    }

    @Bean
    public PlatformTransactionManager dataplatformTransactionManager(
            final @Qualifier("dataplatformEntityManagerFactory") LocalContainerEntityManagerFactoryBean dataplatfromEntiyManagerFactory){
        return new JpaTransactionManager(dataplatfromEntiyManagerFactory.getObject());
    }

}
