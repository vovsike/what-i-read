package vovsike.persistent.book;

import vovsike.domain.models.Book;

public class BookFull extends Book {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
