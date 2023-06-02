package Model.Enum;

public enum SpecialTechniques {

    /** dragon techniques**/
    DRAGON_FORCE("This is the dragon force!"), DRAGON_RAGE("This is the dragon rage!"), ASCENDING_DRAGON("The dragon ascends!"), GREAT_DRAGON("The dragon has born!"), LAST_DRAGON ("Here lies the last dragon!"),

    /** pegasus techniques**/
    PEGASUS_RYU_SEI_KEN("Pegasus Ryu Sei Ken!"), PEGASUS_COMET("Pegasus Comet!") , PEGASUS_GALACTIC_PUNCH("Pegasus galactic Punch!"),

    DIAMOND_DUST("Diamondo dusto!"), AURORA_RAY("Aurora Ray"), AURORA_EXECUTION("Aurora Execution!");

    /** swan techniques**/


    private String shout;


    private SpecialTechniques(String shout)
    {
        this.shout = shout;
    }

    public String getShout()
    {
        return shout;
    }
}
