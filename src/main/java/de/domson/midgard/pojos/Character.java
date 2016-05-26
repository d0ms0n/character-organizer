package de.domson.midgard.pojos;

import javax.persistence.*;

/**
 * Created by domson on 24.05.16.
 */
@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;
    @Column
    private String rank;
}
