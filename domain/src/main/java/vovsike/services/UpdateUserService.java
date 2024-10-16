package vovsike.services;

import vovsike.models.Book;
import vovsike.models.User;

import java.util.List;

public interface UpdateUserService {

    User addBookToUser(Book book, Long userId);

    User addBooksToUser(List<Book> books, Long userId);

    User removeBookFromUser(Book book, Long userId);

    User updateUser(User user, Long userId);
}
