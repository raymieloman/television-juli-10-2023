package nl.defensie.oefening.model.tv;

import java.util.ArrayList;
import java.util.List;

public class TvApp {

    public static void main(String[] args) {
        Television philips = new Philips();
        philips.on();
        System.out.println(philips.getCurrentChannel());
        boolean changed = philips.switchChannel(5);
        System.out.println(changed);
        System.out.println(philips.getCurrentChannel());

        //
        Television samsung = new Samsung();
        samsung.on();
        samsung.switchChannel(3);
        samsung.off();

        // LG
        Television lg = new LG();
        lg.on();
        samsung.switchChannel(3);
        lg.off();

        List<Television> televisionArrayList = new ArrayList<>();
        televisionArrayList.add(philips);
        televisionArrayList.add(samsung);
        televisionArrayList.add(lg);

        TelevisionDoctor.fixTvs(televisionArrayList);

        System.out.println(Constants.companyName);

        double price = 100;
        double vat = price * Constants.vatPercentage;
        double totalPrice = price + vat;
        System.out.println(totalPrice);
    }
}
