package de.domson.midgard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import de.domson.midgard.model.User;
import de.domson.midgard.repository.UserRepository;


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

    public User getUserByUsername(String username){
        User user = userRepository.findUserByUsername(username);
        return user;
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
