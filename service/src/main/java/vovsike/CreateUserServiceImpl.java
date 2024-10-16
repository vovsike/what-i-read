package vovsike;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import vovsike.models.Book;
import vovsike.repositories.BookRepository;
import vovsike.services.CreateUserService;
import vovsike.models.User;
import vovsike.repositories.UserRepository;

import java.util.Collections;
import java.util.Objects;

@ApplicationScoped
public class CreateUserServiceImpl implements CreateUserService {

    @Inject
    UserRepository userRepository;

    @Inject
    BookRepository bookRepository;

    @Override
    public User createUser(User user) {
        if (!isUserValid(user)){
            throw new IllegalArgumentException();
        }
        for (Book book : user.getBooksRead() ) {
            if (Objects.isNull(book.getId())){
                throw new IllegalArgumentException("Book id cannot be null");
            }
            if (!bookRepository.exists(book.getId())){
                bookRepository.createBook(book);
            };
        }
        return userRepository.createUser(user);
    }


    private Boolean isUserValid(User user) {
        if (Objects.isNull(user.getBooksRead())) {
            user.setBooksRead(Collections.emptyList());
        }
        return user.getNickName() != null && user.getEmail() != null;
    }
}
