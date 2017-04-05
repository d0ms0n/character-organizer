package de.domson.midgard.controller;

import de.domson.midgard.model.Character;
import de.domson.midgard.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by domson on 24.05.16.
 */
@RestController
public class CharacterController {

    @Autowired
    CharacterService charService;

    @RequestMapping(value = "/chars", method = RequestMethod.GET)
    public List<Character> getAllChars(){
        List<Character> characters = charService.getAllChars();
        return characters;
    }

    @RequestMapping(value = "/chars", method = RequestMethod.GET, params = {"username"})
    public List<Character> getAllUsersFiltered(@RequestParam("username") String username){

        return charService.getAllCharsForUsername(username);
    }
}
