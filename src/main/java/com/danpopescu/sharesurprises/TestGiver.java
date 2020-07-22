package com.danpopescu.sharesurprises;

import com.danpopescu.sharesurprises.bag.BagTypes;
import com.danpopescu.sharesurprises.giver.AbstractGiveSurprises;
import com.danpopescu.sharesurprises.giver.GiveSurpriseAndApplause;
import com.danpopescu.sharesurprises.giver.GiveSurpriseAndHug;
import com.danpopescu.sharesurprises.giver.GiveSurpriseAndSing;
import com.danpopescu.sharesurprises.surprise.GatherSurprises;

public class TestGiver {

    public static void main(String[] args) {
        System.out.println("-------------------------Test GiveSurpriseAndApplause-------------------------");
        AbstractGiveSurprises giveAndApplause = new GiveSurpriseAndApplause(BagTypes.RANDOM, 1);
        testGiveSurprises(giveAndApplause);

        System.out.println("\n-------------------------Test GiveSurpriseAndApplause-------------------------");
        AbstractGiveSurprises giveAndHug = new GiveSurpriseAndHug(BagTypes.FIFO, 0);
        testGiveSurprises(giveAndHug);

        System.out.println("\n-------------------------Test GiveSurpriseAndApplause-------------------------");
        AbstractGiveSurprises giveAndSing = new GiveSurpriseAndSing(BagTypes.LIFO, 0);
        testGiveSurprises(giveAndSing);
    }

    public static void testGiveSurprises(AbstractGiveSurprises giver) {
        giver.put(GatherSurprises.gather(10));
        System.out.println(giver);
        System.out.println("Give one:");
        giver.give();

        System.out.println("\nGive all");
        giver.giveAll();
    }
}
