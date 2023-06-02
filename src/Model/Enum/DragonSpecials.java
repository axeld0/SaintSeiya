package Model.Enum;

public enum DragonSpecials {

    DRAGON_FORCE("This is the dragon force!"), DRAGON_RAGE("This is the dragon rage!"), ASCENDING_DRAGON("The dragon ascends!"), GREAT_DRAGON("The dragon has born!"), LAST_DRAGON ("Here lies the last dragon!");

    private String shout;

    private DragonSpecials(String shout){
        this.shout = shout;
    }

    public String getShout() {
        return shout;
    }
}
