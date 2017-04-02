package de.domson.midgard.controller;

import de.domson.midgard.service.UserService;
import de.domson.midgard.pojos.User;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by domson on 02.04.17.
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }

    @RequestMapping(value="/users", method = RequestMethod.GET, params = {"firstname"})
    public List<User> getAllUsersFiltered(@RequestParam("firstname") String firstname ){

        return userService.getUsersByFirstname(firstname);
    }

    @RequestMapping(value="/users/{id}", method = RequestMethod.GET)
    public User getUserByName(@PathVariable("id") Long id){

        return userService.getUserById(id);
    }

    @RequestMapping(value="/users/email/{email:.+}", method = RequestMethod.GET)
    public User getUserByName(@PathVariable("email") String email) throws NotFoundException {
        User user = userService.getUserByEmail(email);
        if (user == null){
            throw new ResourceNotFoundException();
        }
        return user;
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public class ResourceNotFoundException extends RuntimeException {

    }
}


