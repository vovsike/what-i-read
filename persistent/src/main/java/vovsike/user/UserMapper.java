package vovsike.user;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import vovsike.book.BookMapper;
import vovsike.models.User;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA_CDI, injectionStrategy = InjectionStrategy.FIELD,
        uses = {BookMapper.class})
public interface UserMapper {

    UserEntity toEntity(User user);

    User toUser(UserEntity userEntity);
}
