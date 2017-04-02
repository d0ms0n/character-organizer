package de.domson.midgard.service;

import de.domson.midgard.repository.UserRepository;
import de.domson.midgard.pojos.User;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by domson on 02.04.17.
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        List<User> users = (List<User>) userRepository.findAll();
        return users;
    }

    public List<User> getUsersByFirstname(String firstname){
        List<User> users = userRepository.findUsersByFirstname(firstname);
        return users;
    }

    public User getUserById(Long id){
        User user = userRepository.findOne(id);
        return user;
    }

    public User getUserByEmail(String email){
        User user = userRepository.findUserByEmail(email);
        return user;
    }
}
