package de.domson.midgard.armour;

/**
 * Created by domson on 30.03.17.
 */
public class KettenRuestung extends Armour {

    public KettenRuestung(){
        name = "Kettenrüstung";
        type = ArmourType.KR;
        minStrength = 31;
        healthPointsBonus = 3;
        rangeMalus = 4;
        agilityMalus = 0;
        attackBonusMalus = 0;
        defenceBonusMalus = 1;
    }
}
