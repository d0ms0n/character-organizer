package de.domson.midgard.objects.armour;

/**
 * Created by domson on 30.03.17.
 */
public class OhneRuestung extends Armour{

    public OhneRuestung(){
        name = "Ohne Rüstung";
        type = ArmourType.OR;
        minStrength = 0;
        healthPointsBonus = 0;
        rangeMalus = 0;
        agilityMalus = 0;
        attackBonusMalus = 0;
        defenceBonusMalus = 0;
    }
}
