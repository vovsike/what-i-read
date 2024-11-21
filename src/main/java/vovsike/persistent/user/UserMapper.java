package vovsike.persistent.user;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import vovsike.domain.models.User;
import vovsike.persistent.book.BookMapper;

@Mapper(componentModel = MappingConstants.ComponentModel.JAKARTA_CDI, injectionStrategy = InjectionStrategy.FIELD,
        uses = {BookMapper.class})
public interface UserMapper {

    UserEntity toEntity(User user);

    User toUser(UserEntity userEntity);
}
