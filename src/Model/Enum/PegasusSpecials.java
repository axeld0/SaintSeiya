package Model.Enum;

public enum PegasusSpecials {

    PEGASUS_RYU_SEI_KEN("Pegasus Ryu Sei Ken!"), PEGASUS_COMET("Pegasus Comet!") , PEGASUS_GALACTIC_PUNCH("Pegasus galactic Punch!");

    private String shout;

    private PegasusSpecials(String shout)
    {
        this.shout = shout;
    }

    public String getShout()
    {
        return shout;
    }

}
