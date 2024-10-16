package vovsike.user;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import vovsike.book.BookEntity;
import vovsike.models.User;
import vovsike.repositories.UserRepository;

import java.util.List;

@ApplicationScoped
public class UserRepositoryStub implements UserRepository {

    @Inject
    UserMapper userMapper;

    @Override
    public User getUserById(Long id) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setNickName("SomeNickName");
        userEntity.setEmail("SomeEmail");
        userEntity.setBooksRead(List.of(
                new BookEntity(1L, "SomeTitle", "SomeAuthor"),
                new BookEntity(2L, "SomeTitle2", "SomeAuthor2")));
        return userMapper.toUser(userEntity);
    }

    @Override
    public User getUserByName(String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1L);
        userEntity.setNickName(name);
        userEntity.setEmail("SomeEmail");
        userEntity.setBooksRead(List.of(
                new BookEntity(1L, "SomeTitle", "SomeAuthor"),
                new BookEntity(2L, "SomeTitle2", "SomeAuthor2")));
        return userMapper.toUser(userEntity);
    }

    @Override
    public User createUser(User user) {
        UserEntity userEntity = userMapper.toEntity(user);
        userEntity.setId(1L);
        return userMapper.toUser(userEntity);
    }

    @Override
    public User updateUser(User user) {
        return user;
    }

    @Override
    public void deleteUser(Long id) {
        return;
    }

    @Override
    public Boolean checkExists(Long id) {
        return id == 1L;
    }

}
