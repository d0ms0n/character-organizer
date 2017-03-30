package de.domson.midgard.armour;

/**
 * Created by domson on 30.03.17.
 */
public class TextilRuestung extends Armour{

    public TextilRuestung(){
        name = "Textilrüstung";
        type = ArmourType.TR;
        minStrength = 0;
        healthPointsBonus = 1;
        rangeMalus = 0;
        agilityMalus = 0;
        attackBonusMalus = 0;
        defenceBonusMalus = 0;
    }
}
