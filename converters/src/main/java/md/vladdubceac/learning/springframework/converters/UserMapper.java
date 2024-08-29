package md.vladdubceac.learning.springframework.converters;

import md.vladdubceac.learning.domain.UserCommand;
import md.vladdubceac.learning.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserCommand userToUserCommand(User user);

    User userCommandToUser(UserCommand user);

}
