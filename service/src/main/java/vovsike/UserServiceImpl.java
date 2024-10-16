package vovsike;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import vovsike.models.User;
import vovsike.repositories.UserRepository;
import vovsike.user.UserService;

@ApplicationScoped
public class UserServiceImpl implements UserService {

    @Inject
    UserRepository userRepository;

    @Override
    public User getUser(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        if (userRepository.checkExists(id)) {
            userRepository.deleteUser(id);
        }
    }

    @Override
    public void addBookToUser(Long userId, Long bookId) {

    }
}
