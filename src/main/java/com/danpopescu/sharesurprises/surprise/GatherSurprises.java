package com.danpopescu.sharesurprises.surprise;

import com.danpopescu.sharesurprises.bag.BagFactoryOptimizeAccess;
import com.danpopescu.sharesurprises.bag.BagTypes;
import com.danpopescu.sharesurprises.bag.IBag;

import java.util.Random;

/**
 * Utility class used to instantiate at random
 * classes that implement the ISurprise interface.
 */
public final class GatherSurprises {

    private static final Random random = new Random();
    private static final BagFactoryOptimizeAccess bagFactory = BagFactoryOptimizeAccess.getInstance();

    private GatherSurprises() {
    }

    /**
     * Chooses at random classes that implement the ISurprise interface
     * and generates objects of these classes.
     * @param n a number of objects to generate
     * @return an IBag that contains the generated objects
     */
    public static IBag gather(int n) {
        IBag bag = GatherSurprises.bagFactory.makeBag(BagTypes.FIFO);
        for (int i = 0; i < n; i++) {
            bag.put(GatherSurprises.gather());
        }
        return bag;
    }

    /**
     * Chooses at random a class that implements the ISurprise interface
     * and generates an object of that class.
     * @return an object of a class that implements ISurprise interface
     */
    public static ISurprise gather() {
        String[] types = {"FORTUNE_COOKIE", "MINION_TOY", "CANDIES"};
        int randomIndex = GatherSurprises.random.nextInt(types.length);

        switch (types[randomIndex]) {
            case "FORTUNE_COOKIE":
                return FortuneCookie.generate();
            case "MINION_TOY":
                return MinionToy.generate();
            default:
                return Candies.generate();
        }
    }
}
