package vovsike.domain.repositories;

import vovsike.domain.models.User;

public interface UserRepository {

    User getUserById(Long id);

    User getUserByName(String name);

    User createUser(User user);

    User updateUser(User user);

    void deleteUser(Long id);

    Boolean checkExists(Long id);
}
