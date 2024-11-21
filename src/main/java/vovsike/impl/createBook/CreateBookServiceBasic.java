package vovsike.impl.createBook;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import vovsike.domain.createBook.BookAlreadyExists;
import vovsike.domain.createBook.CreateBook;
import vovsike.domain.createBook.CreateBookService;
import vovsike.domain.models.Book;
import vovsike.domain.repositories.BookRepository;
import vovsike.domain.repositories.UserRepository;


@ApplicationScoped
public class CreateBookServiceBasic implements CreateBookService {

    private BookRepository bookRepository;

    private UserRepository userRepository;

    public CreateBookServiceBasic() {
    }

    @Inject
    public CreateBookServiceBasic(BookRepository bookRepository, UserRepository userRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void createBook(CreateBook createBook) throws BookAlreadyExists {
        if (bookRepository.exists(createBook)) {
            throw new BookAlreadyExists();
        };

        bookRepository.createBook(createBook);
    }

    @Override
    public void createAndAssignBook(CreateBook createBook, Long userId) {
        Book book;
        if (bookRepository.exists(createBook)) {
            book = bookRepository.getBookByName(createBook.getTitle());
        } else {
            book = bookRepository.createBook(createBook);
        }
        var user = userRepository.getUserById(userId);
        user.getBooksRead().add(book);
        userRepository.updateUser(user);
    }


}
