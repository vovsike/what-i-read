package vovsike;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import vovsike.models.Book;
import vovsike.models.User;
import vovsike.repositories.BookRepository;
import vovsike.repositories.UserRepository;
import vovsike.services.UpdateUserService;

import java.util.List;
import java.util.Objects;

@ApplicationScoped
public class UpdatePersonServiceImpl implements UpdateUserService {

    @Inject
    UserRepository userRepository;

    @Inject
    BookRepository bookRepository;

    @Override
    public User addBookToUser(Book book, Long userId) {
        User user = userRepository.getUserById(userId);
        try {
            Objects.requireNonNull(user);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Non existent user");
        }
        if (!user.getBooksRead().contains(book)) {
            if (bookRepository.exists(book)) {
                user.getBooksRead().add(book);
                userRepository.updateUser(user);
                return user;
            }
        }
        return user;
    }

    @Override
    public User addBooksToUser(List<Book> books, Long userId) {
        return null;
    }

    @Override
    public User removeBookFromUser(Book book, Long userId) {
        return null;
    }

    @Override
    public User updateUser(User user, Long userId) {
        return null;
    }
}
