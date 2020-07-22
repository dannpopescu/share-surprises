package com.danpopescu.sharesurprises.giver;

import com.danpopescu.sharesurprises.bag.BagTypes;

/**
 * A Class whose role is to give surprises and hive a hug immediately after.
 */
public class GiveSurpriseAndHug extends AbstractGiveSurprises {

    public GiveSurpriseAndHug(BagTypes type, int waitTime) {
        super(type, waitTime);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }
}
