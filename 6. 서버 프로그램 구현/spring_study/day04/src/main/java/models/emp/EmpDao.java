package models.emp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Transactional // 트랜잭션 설정
public class EmpDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert() {
        String sql = "INSERT INTO EMP2 (EMPNO, ENAME, JOB) VALUES (?, ?, ?)";
        int affectedRows = jdbcTemplate.update(sql, 1, "사원", "STAFF");
        //int affectedRows = jdbcTemplate.update(sql, 2, "사원2", "STAFF");
        System.out.println(affectedRows);
    }

    public long insert(Emp emp) { // prepareStatement
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String sql = "INSERT INTO EMP2 (EMPNO, ENAME, JOB) VALUES (EMP2_SEQ.nextval, ?, ?)";
        jdbcTemplate.update(con ->  {
            PreparedStatement pstmt = con.prepareStatement(sql, new String[] {"EMPNO"});
                pstmt.setString(1, emp.getENAME());
                pstmt.setString(2, emp.getJOB());

                return pstmt;
        }, keyHolder);

        Number key = keyHolder.getKey();
        long EMPNO = key.longValue();

      return EMPNO;
    }

    public void delete(int no) {
        String sql = "DELETE FROM EMP2 WHERE EMPNO =?";
        int affectedRows = jdbcTemplate.update(sql, no);
        System.out.println(affectedRows);
    }

    public List<Emp> gets() {
        String sql = "SELECT * FROM EMP";
        List<Emp> emps = jdbcTemplate.query(sql, this::mapper); // 레코드 조회

        return emps;
    }

    public Emp get(long EMPNO) {
        try {
            String sql = "SELECT * FROM EMP WHERE EMPNO = ?";
            Emp emp = jdbcTemplate.queryForObject(sql, this::mapper, EMPNO); // 단일 레코드 조회

            return emp;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public long getTotal() {
        String sql = "SELECT COUNT(*) FROM EMP";
        long count = jdbcTemplate.queryForObject(sql, Long.class);

        return count;
    }

    private Emp mapper(ResultSet rs, int i) throws SQLException {
        Emp emp = new Emp();
        emp.setEMPNO(rs.getLong("EMPNO"));
        emp.setENAME(rs.getString("ENAME"));
        emp.setJOB(rs.getString("JOB"));
        return emp;
    }
}
