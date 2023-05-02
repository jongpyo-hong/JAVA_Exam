package models.board;

public class Board {
    private long id; // 게시글 번호
    private String subject; // 제목
    private String poster; // 작성자

    public Board(long id, String subject, String poster) {
        this.id = id;
        this.subject = subject;
        this.poster = poster;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
