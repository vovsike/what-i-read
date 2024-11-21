package vovsike.domain.repositories;

import vovsike.domain.models.Book;

public interface BookRepository {

    Book getBook(Long id);

    Book createBook(Book book);

    void deleteBook(Long id);

    Boolean exists(Long id);

    Boolean exists(Book book);

    Book getBookByName(String name);
}
