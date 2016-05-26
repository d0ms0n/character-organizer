package de.domson.midgard;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by domson on 24.05.16.
 */
@RestController
public class CharakterController {

    @RequestMapping("/char")
    public String test(){
        return "Hello";
    }
}
