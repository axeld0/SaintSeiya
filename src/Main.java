import Model.JSON.JSONControler;
import Model.Saints.*;

public class Main {
    public static void main(String[] args) {
        AthenaSaint seiya = new AthenaSaint("Seiya", "Pegasus", 13, 165 ,"1/12", 'B', "Japan", "Sactuary (Greece)", 100, 1000);
        AthenaSaint shiryu = new AthenaSaint("Shiryu", "Dragon", 14, 172 ,"4/10", 'A', "Japan", "Roza (China)", 80, 900);
        AthenaSaint Hyoga = new AthenaSaint("Hyoga", "Swan", 13, 173 ,"23/1", '0', "Russia", "Siberia", 80, 850);

        BronzeSaints bronzeSaints = new BronzeSaints<AthenaSaint>();
        bronzeSaints.addSaint(seiya);
        bronzeSaints.addSaint(shiryu);
        bronzeSaints.addSaint(Hyoga);

        JSONControler jc = new JSONControler();

        jc.SetToJSON(bronzeSaints);

    }
}