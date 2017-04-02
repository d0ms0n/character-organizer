package de.domson.midgard.objects.armour;

/**
 * Created by domson on 30.03.17.
 */
public class PlattenRuestung extends Armour{

    public PlattenRuestung(){
        name = "Plattenrüstung";
        type = ArmourType.PR;
        minStrength = 61;
        healthPointsBonus = 4;
        rangeMalus = 8;
        agilityMalus = 25;
        attackBonusMalus = 0;
        defenceBonusMalus = 3;
    }
}
