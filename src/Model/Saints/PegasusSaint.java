package Model.Saints;

import Model.Enum.PegasusSpecials;

public class PegasusSaint extends AthenaSaint {

    private PegasusSpecials specialTech;


    public PegasusSaint(String name, String constelation, int age, int height, String birthday, char bloodtype, String birthplace, String trainingGround, int hp, int power, PegasusSpecials specialTech) {
        super(name, constelation, age, height, birthday, bloodtype, birthplace, trainingGround, hp, power);
        this.specialTech = specialTech;
    }


    @Override
    public String specialTech() {
        return specialTech.getShout();
    }
}
