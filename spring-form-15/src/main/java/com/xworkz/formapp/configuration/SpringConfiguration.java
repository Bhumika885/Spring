package com.xworkz.formapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@ComponentScan(basePackages = "com.xworkz.formapp")
public class SpringConfiguration {
    public SpringConfiguration(){

        System.out.println("SpringConfiguration invoked");
    }

    @Bean
   public LocalContainerEntityManagerFactoryBean getlocalContainerEntityManagerFactoryBean(){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setPackagesToScan("com.xworkz.formapp.entity");
        bean.setDataSource(getDataSource());
        bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
bean.setJpaProperties(getJpaProperties());


        return bean;



    }


    private Properties getJpaProperties(){

        Properties properties = new Properties();
        properties.setProperty("show_sql","true");
        return properties;
    }

    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springMVC");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("Xworkzodc@123");

        return driverManagerDataSource;


    }
}

