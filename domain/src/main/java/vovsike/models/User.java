package vovsike.models;

import java.util.List;

public class User {

    private Long id;

    private String nickName;

    private String email;

    private List<Book> booksRead;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Book> getBooksRead() {
        return booksRead;
    }

    public void setBooksRead(List<Book> booksRead) {
        this.booksRead = booksRead;
    }
}
