package de.domson.midgard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by domson on 24.05.16.
 */
@SpringBootApplication
@EnableJpaRepositories
public class CharacterOrganizerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharacterOrganizerApplication.class, args);
    }
}
