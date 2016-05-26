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

    private String name;
    private String type;
    private String rank;

    private int healthPointsMax;   //LP
    private int staminaPointsMax;  //AP
    private int healthPoints;
    private int staminaPoints;

    private int strength;
    private int dexterity;      //Gs
    private int agility;        //Gw
    private int constitution;   //Ko
    private int intelligence;   //In
    private int magictalent;    //Zt

    private int appearance;     //Au
    private int charisma;       //pA
    private int willpower;      //Wk
    private int range;          //B
    private int brawl;          //Raufen

    private int staminaBonus;   //Ausdauerbonus
    private int damageBonus;    //Schadensbonus
    private int attackBonus;    //AngB
    private int defenceBonus;   //AbwB
    private int resBonusMind;   //Resistenzbonus Geist
    private int resBonusBody;   //Resistenzbonus Körper
    private int conjuringBonus; //ZaubB


    private int defence;        //Abwehr
    private int resisitance;    //Resistenz
    private int conjuring;      //Zaubern


}
