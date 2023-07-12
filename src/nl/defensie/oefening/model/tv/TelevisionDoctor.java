package nl.defensie.oefening.model.tv;

import java.util.List;

public class TelevisionDoctor {
    public static void fixTvs(List<Television> televisionList) {
        for (Television tv : televisionList) {
            System.out.println("Switching on using Doctor");
            tv.on();
        }
    }
}
