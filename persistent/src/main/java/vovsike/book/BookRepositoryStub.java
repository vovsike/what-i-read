package vovsike.book;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import vovsike.models.Book;
import vovsike.repositories.BookRepository;

@ApplicationScoped
public class BookRepositoryStub implements BookRepository {
    @Inject
    BookMapper bookMapper;

    @Override
    public Book getBook(Long id) {
        BookEntity foundBook = new BookEntity();
        foundBook.setId(id);
        foundBook.setAuthor("SomeAuthor");
        foundBook.setTitle("SomeTitle");
        return bookMapper.toBook(foundBook);
    }

    @Override
    public Book createBook(Book book) {
        BookEntity bookEntity = bookMapper.toEntity(book);
        bookEntity.setId(1L);
        return bookMapper.toBook(bookEntity);
    }

    @Override
    public void deleteBook(Long id) {

    }

    @Override
    public Boolean exists(Long id) {
        return id == 100L;
    }

    @Override
    public Boolean exists(Book book) {
        return true;
    }


}