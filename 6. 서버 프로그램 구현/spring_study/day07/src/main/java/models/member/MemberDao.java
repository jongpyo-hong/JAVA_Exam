package models.member;

import controllers.JoinForm;
import lombok.RequiredArgsConstructor;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
@RequiredArgsConstructor
public class MemberDao {

    private final JdbcTemplate jdbcTemplate;

    public boolean insert(JoinForm joinForm) {
        String sql = "INSERT INTO MEMBER (USERNO, USERID, USERPW, USERNM) " +
                    "VALUES (MEMBER_SEQ.nextval, ?, ?, ?)";

        /** 비밀번호 암호화 */
        String userPw = joinForm.getUserPw();
        String hash = BCrypt.hashpw(userPw, BCrypt.gensalt(10));

        int cnt = jdbcTemplate.update(sql,
                    joinForm.getUserId(), hash, joinForm.getUserNm());

        return cnt > 0;
    }

    public Member get(String userId) {
        try {
            String sql = "SELECT * FROM MEMBER WHERE USERID=?";
            Member member = jdbcTemplate.queryForObject(sql, this::mapper, userId);

            return member;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean exists(String userId) {

        String sql = "SELECT COUNT(*) FROM MEMBER WHERE USERID = ?";
        long cnt = jdbcTemplate.queryForObject(sql, Long.class, userId);

        return cnt > 0;
    }

    private Member mapper(ResultSet rs,int i) throws SQLException {
        Member member = new Member();
        member.setUserNo(rs.getLong("USERNO"));
        member.setUserId(rs.getString("USERID"));
        member.setUserPw(rs.getString("USERPW"));
        member.setUserNm(rs.getString("USERNM"));
        member.setRegDt(rs.getTimestamp("REGDT").toLocalDateTime());

        return member;
    }

}
