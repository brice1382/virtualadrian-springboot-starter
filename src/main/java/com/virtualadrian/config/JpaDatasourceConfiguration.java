package com.virtualadrian.config;

import java.util.Properties;

import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * The type Server monitor repository configuration.
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.virtualadrian",
        entityManagerFactoryRef = "entityManagerFactory",
        transactionManagerRef = "transactionManager")
@EnableTransactionManagement
public class JpaDatasourceConfiguration {

    @Autowired
    private Environment environment;

    @Value("${spring.datasource.hikari.maxPoolSize:10}")
    private int maxPoolSize;

    /**
     * Data source properties data source properties.
     *
     * @return the data source properties
     */
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSourceProperties dataSourceProperties(){
        return new DataSourceProperties();
    }

    /**
     * Configure HikariCP pooled DataSource.
     *
     * @return the data source
     */
    @Bean
    public DataSource dataSource() {
        // grab properties from config or yml
        DataSourceProperties dataSourceProperties = dataSourceProperties();
        // construct data source
        HikariDataSource dataSource = (HikariDataSource) DataSourceBuilder
                .create(dataSourceProperties.getClassLoader())
                .driverClassName(dataSourceProperties.getDriverClassName())
                .url(dataSourceProperties.getUrl())
                .username(dataSourceProperties.getUsername())
                .password(dataSourceProperties.getPassword())
                .type(HikariDataSource.class)
                .build();

        dataSource.setMaximumPoolSize(maxPoolSize);
        return dataSource;
    }

    /**
     * Entity Manager Factory setup.
     *
     * @return the local container repository manager factory bean
     * @throws NamingException the naming exception
     */
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws NamingException {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setPackagesToScan(new String[] { "com.virtualadrian" });
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
        factoryBean.setJpaProperties(jpaProperties());
        return factoryBean;
    }

    /**
     * Provider specific adapter.
     *
     * @return the jpa vendor adapter
     */
    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        return new HibernateJpaVendorAdapter();
    }

    private Properties jpaProperties() {
        Properties properties = new Properties();

        properties.put("hibernate.dialect", environment.getRequiredProperty("spring.datasource.hibernate.dialect"));
        properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("spring.datasource.hibernate.hbm2ddl.method"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("spring.datasource.hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("spring.datasource.hibernate.format_sql"));

        String defaultSchema = environment.getRequiredProperty("spring.datasource.defaultSchema");

        if(defaultSchema != null && defaultSchema.equalsIgnoreCase("")){
            properties.put("hibernate.default_schema", environment.getRequiredProperty("spring.spring.defaultSchema"));
        }
        return properties;
    }

    @Bean(name = "transactionManager")
    @Autowired
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(emf);
        return txManager;
    }
}
