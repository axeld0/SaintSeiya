package Model.Enum;

public enum SwanSpecials {

    DIAMOND_DUST("Diamondo dusto!"), AURORA_RAY("Aurora Ray"), AURORA_EXECUTION("Aurora Execution!");

    private String shout;

    private SwanSpecials(String shout)
    {
        this.shout = shout;
    }

    public String getShout()
    {
        return shout;
    }
}
