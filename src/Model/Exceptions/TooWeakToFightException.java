package Model.Exceptions;

public class TooWeakToFightException extends IllegalArgumentException{

    public TooWeakToFightException(String info)
    {
        super(info);
        System.out.println("Our Saint is too weak to defend Athena.");
    }

}
