package giver;

import bag.BagTypes;

/**
 * A Class whose role is to give surprises and sing immediately after.
 */
public class GiveSurpriseAndSing extends  AbstractGiveSurprises {

    public GiveSurpriseAndSing(BagTypes type, int waitTime) {
        super(type, waitTime);
    }

    @Override
    protected void giveWithPassion() {
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
    }
}
