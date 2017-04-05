package de.domson.midgard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import de.domson.midgard.model.User;
import de.domson.midgard.service.UserService;
import javassist.NotFoundException;


/**
 * Created by domson on 02.04.17.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }

    @RequestMapping(value = "/users/username/{username}", method = RequestMethod.GET)
    public User getAllUsersFiltered(@PathVariable("username") String username){

        return userService.getUserByUsername(username);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User getUserByName(@PathVariable("id") Long id){

        return userService.getUserById(id);
    }

    @RequestMapping(value = "/users/email/{email:.+}", method = RequestMethod.GET)
    public User getUserByName(@PathVariable("email") String email) throws NotFoundException {
        User user = userService.getUserByEmail(email);
        if (user == null){
            throw new ResourceNotFoundException();
        }
        return user;
    }
    /**
     *
     */
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public class ResourceNotFoundException extends RuntimeException {

    }
}


