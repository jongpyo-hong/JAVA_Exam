package models.member;

public class Member {
    private String userId;
    private String userPw;
    private String userPwRe;

    private String userNm;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserPwRe() {
        return userPwRe;
    }

    public void setUserPwRe(String userPwRe) {
        this.userPwRe = userPwRe;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userPwRe='" + userPwRe + '\'' +
                ", userNm='" + userNm + '\'' +
                '}';
    }
}
