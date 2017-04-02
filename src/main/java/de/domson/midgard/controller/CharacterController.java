package de.domson.midgard.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by domson on 24.05.16.
 */
@RestController
public class CharacterController {

    @RequestMapping(value="/char", method = RequestMethod.GET)
    public String testme(){
        return "Hello";
    }
}
