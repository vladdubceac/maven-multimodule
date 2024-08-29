package md.vladdubceac.development.springframework.controllers;

import md.vladdubceac.learning.domain.UserCommand;
import md.vladdubceac.learning.entities.User;

public class UserController {

    User saveUser(UserCommand command){
        // fake impl
        return new User();
    }
}
