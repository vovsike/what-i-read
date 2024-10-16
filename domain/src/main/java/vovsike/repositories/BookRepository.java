package vovsike.repositories;

import vovsike.models.Book;

public interface BookRepository {

    Book getBook(Long id);

    Book createBook(Book book);

    void deleteBook(Long id);

    Boolean exists(Long id);

    Boolean exists(Book book);
}
