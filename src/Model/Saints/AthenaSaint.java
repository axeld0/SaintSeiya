package Model.Saints;

import Model.Interfaces.SpecialTechnique;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public abstract class AthenaSaint implements SpecialTechnique {

    private String name;

    private String constelation;

    private int age;

    private int height;

    private String birthday;

    private char bloodtype;

    private String birthplace;

    private String trainingGround;

    private int hp;
    private int power;


    public AthenaSaint(String name, String constelation,int age, int height, String birthday, char bloodtype, String birthplace, String trainingGround, int hp, int power) {
        this.name = name;
        this.constelation = constelation;
        this.age = age;
        this.height = height;
        this.birthday = birthday;
        this.bloodtype = bloodtype;
        this.birthplace = birthplace;
        this.trainingGround = trainingGround;
        this.hp = hp;
        this.power = power;
    }

    public AthenaSaint() {
        name = "";
        constelation = "";
        age = 0;
        height = 0;
        birthday = "";
        bloodtype = ' ';
        birthplace = "";
        trainingGround = "";
        hp= 0;
        power = 0;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstelation() {
        return constelation;
    }

    public void setConstelation(String constelation) {
        this.constelation = constelation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public char getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(char bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getTrainingGround() {
        return trainingGround;
    }

    public void setTrainingGround(String trainingGround) {
        this.trainingGround = trainingGround;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AthenaSaint that = (AthenaSaint) o;

        if (age != that.age) return false;
        if (height != that.height) return false;
        if (bloodtype != that.bloodtype) return false;
        if (hp != that.hp) return false;
        if (power != that.power) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(constelation, that.constelation)) return false;
        if (!Objects.equals(birthday, that.birthday)) return false;
        if (!Objects.equals(birthplace, that.birthplace)) return false;
        return Objects.equals(trainingGround, that.trainingGround);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (constelation != null ? constelation.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + height;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (int) bloodtype;
        result = 31 * result + (birthplace != null ? birthplace.hashCode() : 0);
        result = 31 * result + (trainingGround != null ? trainingGround.hashCode() : 0);
        result = 31 * result + hp;
        result = 31 * result + power;
        return result;
    }

    @Override
    public String toString() {
        return "AthenaSaint{" +
                "name='" + name + '\'' +
                ", constelation='" + constelation + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", birthday=" + birthday +
                ", bloodtype=" + bloodtype +
                ", birthplace='" + birthplace + '\'' +
                ", trainingGround='" + trainingGround + '\'' +
                ", hp=" + hp +
                ", power=" + power +
                '}';
    }


    /**
     * fighting techniques
     */

    public String punching()
    {
        return "Pow pow";
    }

    public String parry()
    {
        return "Your cosmos is not high enough to harm me.";
    }

}
