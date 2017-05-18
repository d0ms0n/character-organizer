package de.domson.midgard.controller;

import de.domson.midgard.CharacterOrganizerApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by domson on 03.04.17.
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { CharacterOrganizerApplication.class})
@WebAppConfiguration
public class UserControllerIntegrationTests {

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() throws Exception {
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void getLogin() throws Exception {

        this.mockMvc.perform(get("/login")).andDo(print())
                .andExpect(view().name("login"));

    }

    @Test
    public void getLogin1() throws Exception {

        this.mockMvc.perform(get("/users")).andDo(print())
                .andExpect(status().isOk());
    }
}
