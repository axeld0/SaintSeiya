package Model.Saints;

import Model.Enum.DragonSpecials;

public class DragonSaint extends AthenaSaint {

    private DragonSpecials specialTech;

    public DragonSaint(String name, String constelation, int age, int height, String birthday, char bloodtype, String birthplace, String trainingGround, int hp, int power, DragonSpecials specialTech) {
        super(name, constelation, age, height, birthday, bloodtype, birthplace, trainingGround, hp, power);
        this.specialTech = specialTech;
    }

    public DragonSaint(DragonSpecials specialTech) {
        this.specialTech = specialTech;
    }

    @Override
    public String specialTech()
    {
        return specialTech.getShout();
    }

}
