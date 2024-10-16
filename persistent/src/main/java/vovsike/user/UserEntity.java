package vovsike.user;

import vovsike.book.BookEntity;

import java.util.List;

public class UserEntity {

    private Long id;;

    private String nickName;

    private String email;

    private List<BookEntity> booksRead;

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

    public List<BookEntity> getBooksRead() {
        return booksRead;
    }

    public void setBooksRead(List<BookEntity> booksRead) {
        this.booksRead = booksRead;
    }
}
