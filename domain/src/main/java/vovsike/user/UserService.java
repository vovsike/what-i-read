package vovsike.user;

import vovsike.models.User;

public interface UserService {

    User getUser(Long id);

    User updateUser(User user);

    void deleteUser(Long id);

    void addBookToUser(Long userId, Long bookId);
}
