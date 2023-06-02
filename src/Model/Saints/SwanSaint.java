package Model.Saints;

import Model.Enum.SwanSpecials;

public class SwanSaint extends AthenaSaint{

    private SwanSpecials specialTech;

    public SwanSaint(String name, String constelation, int age, int height, String birthday, char bloodtype, String birthplace, String trainingGround, int hp, int power, SwanSpecials specialTech) {
        super(name, constelation, age, height, birthday, bloodtype, birthplace, trainingGround, hp, power);
        this.specialTech = specialTech;
    }

    public SwanSaint(SwanSpecials specialTech) {
        this.specialTech = specialTech;
    }

    @Override
    public String specialTech() {
        return specialTech.getShout();
    }

}
