package md.vladdubceac.development.springframework.controllers;

import md.vladdubceac.learning.domain.UserCommand;
import md.vladdubceac.learning.entities.User;
import md.vladdubceac.learning.springframework.converters.UserMapper;

public class UserController {

    User saveUser(UserCommand command){
        // fake impl
        return UserMapper.INSTANCE.userCommandToUser(command);
    }
}
