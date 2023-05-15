package configs;

import models.emp.EmpDao;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
public class AppCtx {
    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver"); // 데이터베이스 설정
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:orcl"); // 서버 설정
        ds.setUsername("SCOTT"); // 계정 설정
        ds.setPassword("tiger"); // 설정한 계정 비밀번호
        ds.setInitialSize(2); // 커넥션 풀을 초기화할 때 생성할 초기 커넥션 개수를 지정
        ds.setMaxActive(10); // 커넥션 풀에서 가져올 수 있는 최대 커넥션 개수를 지정, 기본값은 100
        ds.setTestWhileIdle(true); // 테스트 설정 (true, false)
        ds.setMinEvictableIdleTimeMillis(30000); // 최대 유휴 시간
        ds.setTimeBetweenEvictionRunsMillis(3000); // 테스트 주기

        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public EmpDao empDao() {
        return new EmpDao();
    }

    @Bean
    public PlatformTransactionManager transactionManager() { // 트랜잭션 수동 관리로 설정
        DataSourceTransactionManager tm = new DataSourceTransactionManager();
        tm.setDataSource(dataSource());

        return tm;
    }
}
