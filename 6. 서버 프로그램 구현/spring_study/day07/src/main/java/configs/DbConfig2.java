package configs;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class DbConfig2 {

    @Configuration
    @Profile("dev") // 개발시 dev
    static class DevDbConfig {
        @Bean(destroyMethod = "close")
        public DataSource dataSource() {
            System.out.println("dev 프로필로 연결");

            DataSource ds = new DataSource();
            ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
            ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
            ds.setUsername("BOARD2");
            ds.setPassword("aA123456");
            ds.setInitialSize(2);
            ds.setMaxActive(10);
            ds.setTestWhileIdle(true);
            ds.setMinEvictableIdleTimeMillis(30000);
            ds.setTimeBetweenEvictionRunsMillis(3000);

            return ds;
        }

        @Bean
        public JdbcTemplate jdbcTemplate() {
            return new JdbcTemplate(dataSource());
        }

        @Bean
        public PlatformTransactionManager transactionManager() {
            DataSourceTransactionManager tm = new DataSourceTransactionManager();
            tm.setDataSource(dataSource());

            return tm;
        }
    }

    @Configuration
    @Profile("real") // 실 서버 real
    static class RealDbConfig {
        @Bean(destroyMethod = "close")
        public DataSource dataSource() {
            System.out.println("real 프로필 연결");

            DataSource ds = new DataSource();
            ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
            ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
            ds.setUsername("BOARD2");
            ds.setPassword("aA123456");
            ds.setInitialSize(2);
            ds.setMaxActive(10);
            ds.setTestWhileIdle(true);
            ds.setMinEvictableIdleTimeMillis(30000);
            ds.setTimeBetweenEvictionRunsMillis(3000);

            return ds;
        }

        @Bean
        public JdbcTemplate jdbcTemplate() {
            return new JdbcTemplate(dataSource());
        }

        @Bean
        public PlatformTransactionManager transactionManager() {
            DataSourceTransactionManager tm = new DataSourceTransactionManager();
            tm.setDataSource(dataSource());

            return tm;
        }
    }
}
