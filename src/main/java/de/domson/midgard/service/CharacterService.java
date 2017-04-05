package de.domson.midgard.service;

import de.domson.midgard.model.Character;
import de.domson.midgard.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by domson on 03.04.17.
 */
@Service
public class CharacterService {

    @Autowired
    CharacterRepository charRepository;

    public List<Character> getAllChars(){
        List<Character> chars = (List<Character>) charRepository.findAll();
        return chars;
    }

    public Character getCharById(Long charId){
        Character character = charRepository.findOne(charId);
        return character;
    }

    public List<Character> getAllCharsForUsername(String username){
        List<Character> chars = (List<Character>) charRepository.findCharactersByUsername(username);
        return chars;
    }
}
