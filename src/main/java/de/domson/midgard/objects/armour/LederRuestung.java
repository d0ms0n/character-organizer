package de.domson.midgard.objects.armour;

/**
 * Created by domson on 30.03.17.
 */
public class LederRuestung extends Armour{

    public LederRuestung(){
        name = "Lederrüstung";
        type = ArmourType.LR;
        minStrength = 0;
        healthPointsBonus = 2;
        rangeMalus = 0;
        agilityMalus = 0;
        attackBonusMalus = 0;
        defenceBonusMalus = 0;
    }
}
