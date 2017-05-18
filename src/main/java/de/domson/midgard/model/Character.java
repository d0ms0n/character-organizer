package de.domson.midgard.model;

import javax.persistence.*;

/**
 * Created by domson on 24.05.16.
 */
@Entity(name = "characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long charId;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "char_name")
    private String charName;

    @Column(name = "char_type")
    private String charType;
    @Column
    private String rank;

    @Column(name = "health_points_max")
    private int healthPointsMax;   //LP
    @Column(name = "stamina_points_max")
    private int staminaPointsMax;  //AP
    @Column
    private int healthPoints;
    @Column
    private int staminaPoints;

    @Column
    private int strength;
    @Column
    private int dexterity;      //Gs
    @Column
    private int agility;        //Gw
    @Column
    private int constitution;   //Ko
    @Column
    private int intelligence;   //In
    @Column
    private int magictalent;    //Zt

    @Column
    private int appearance;     //Au
    @Column
    private int charisma;       //pA
    @Column
    private int willpower;      //Wk
    @Column
    private int range;          //B
    @Column
    private int brawl;          //Raufen

    @Column
    private int staminaBonus;   //Ausdauerbonus
    @Column
    private int damageBonus;    //Schadensbonus
    @Column
    private int attackBonus;    //AngB
    @Column
    private int defenceBonus;   //AbwB
    @Column
    private int resBonusMind;   //Resistenzbonus Geist
    @Column
    private int resBonusBody;   //Resistenzbonus Körper
    @Column
    private int conjuringBonus; //ZaubB


    @Column
    private int defence;        //Abwehr
    @Column
    private int resistance;    //Resistenz
    @Column
    private int conjuring;      //Zaubern


    public Character() {}



    public Long getCharId() {
        return charId;
    }

    public User getUser() {
        return user;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getCharType() {
        return charType;
    }

    public void setCharType(String charType) {
        this.charType = charType;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getHealthPointsMax() {
        return healthPointsMax;
    }

    public void setHealthPointsMax(int healthPointsMax) {
        this.healthPointsMax = healthPointsMax;
    }

    public int getStaminaPointsMax() {
        return staminaPointsMax;
    }

    public void setStaminaPointsMax(int staminaPointsMax) {
        this.staminaPointsMax = staminaPointsMax;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStaminaPoints() {
        return staminaPoints;
    }

    public void setStaminaPoints(int staminaPoints) {
        this.staminaPoints = staminaPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getMagictalent() {
        return magictalent;
    }

    public void setMagictalent(int magictalent) {
        this.magictalent = magictalent;
    }

    public int getAppearance() {
        return appearance;
    }

    public void setAppearance(int appearance) {
        this.appearance = appearance;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getWillpower() {
        return willpower;
    }

    public void setWillpower(int willpower) {
        this.willpower = willpower;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getBrawl() {
        return brawl;
    }

    public void setBrawl(int brawl) {
        this.brawl = brawl;
    }

    public int getStaminaBonus() {
        return staminaBonus;
    }

    public void setStaminaBonus(int staminaBonus) {
        this.staminaBonus = staminaBonus;
    }

    public int getDamageBonus() {
        return damageBonus;
    }

    public void setDamageBonus(int damageBonus) {
        this.damageBonus = damageBonus;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public int getDefenceBonus() {
        return defenceBonus;
    }

    public void setDefenceBonus(int defenceBonus) {
        this.defenceBonus = defenceBonus;
    }

    public int getResBonusMind() {
        return resBonusMind;
    }

    public void setResBonusMind(int resBonusMind) {
        this.resBonusMind = resBonusMind;
    }

    public int getResBonusBody() {
        return resBonusBody;
    }

    public void setResBonusBody(int resBonusBody) {
        this.resBonusBody = resBonusBody;
    }

    public int getConjuringBonus() {
        return conjuringBonus;
    }

    public void setConjuringBonus(int conjuringBonus) {
        this.conjuringBonus = conjuringBonus;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getConjuring() {
        return conjuring;
    }

    public void setConjuring(int conjuring) {
        this.conjuring = conjuring;
    }
}
