package com.danpopescu.sharesurprises.giver;

import com.danpopescu.sharesurprises.bag.BagTypes;

/**
 * A Class whose role is to give surprises and applaud immediately after.
 */
public class GiveSurpriseAndApplause extends AbstractGiveSurprises {

    public GiveSurpriseAndApplause(BagTypes type, int waitTime) {
        super(type, waitTime);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("Loud applause to you… For it is in giving that we receive.");
    }
}
