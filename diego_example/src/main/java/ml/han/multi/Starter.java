package ml.han.multi;

import java.util.ArrayList;
import java.util.List;

public class Starter {

    public static void main(String[] args) {    //type psvm + enter
        var starter = new Starter();
        starter.Start();
    }

    private void Start(){
        List<Opteller> optellers = new ArrayList<Opteller>();
        var getal = new Getal();

        optellers.add(new Opteller("A", getal));
        optellers.add(new Opteller("B", getal));
        optellers.add(new Opteller("C", getal));

        optellers.forEach(opteller -> new Thread(opteller).start());

    }
}
