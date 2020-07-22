package com.danpopescu.sharesurprises.giver;

import com.danpopescu.sharesurprises.bag.BagFactoryOptimizeAccess;
import com.danpopescu.sharesurprises.bag.BagTypes;
import com.danpopescu.sharesurprises.bag.IBag;
import com.danpopescu.sharesurprises.bag.IBagFactory;
import com.danpopescu.sharesurprises.surprise.ISurprise;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Performs the action of giving surprises to the people.
 */
public abstract class AbstractGiveSurprises {

    /**
     * Bag in which to store the surprises.
     */
    private IBag bag;

    /**
     * Time (in seconds) to wait before giving a com.danpopescu.sharesurprises.surprise when using
     * the giveAll() method.
     */
    private int waitTime;

    public AbstractGiveSurprises(BagTypes type, int waitTime) {
        IBagFactory bagFactory = BagFactoryOptimizeAccess.getInstance();
        this.bag = bagFactory.makeBag(type);
        this.waitTime = waitTime;
    }

    /**
     * Puts a com.danpopescu.sharesurprises.surprise in the com.danpopescu.sharesurprises.bag.
     * @param newSurprise to put in the com.danpopescu.sharesurprises.bag
     */
    public void put(ISurprise newSurprise) {
        this.bag.put(newSurprise);
    }

    /**
     * Moves all the surprises from a com.danpopescu.sharesurprises.bag to this com.danpopescu.sharesurprises.bag.
     * @param bagOfSurprises from which to take out all the surprises
     *                       and put them in this com.danpopescu.sharesurprises.bag
     */
    public void put(IBag bagOfSurprises) {
        this.bag.put(bagOfSurprises);
    }

    /**
     * Takes out one com.danpopescu.sharesurprises.surprise and gives it with passion.
     */
    public void give() {
        ISurprise surprise = this.bag.takeOut();
        surprise.enjoy();
        this.giveWithPassion();
    }

    /**
     * Takes out all the surprises and gives them, while
     * waiting for waitTime seconds between them.
     */
    public void giveAll() {
        while (!this.bag.isEmpty()) {
            this.give();

            try {
                TimeUnit.SECONDS.sleep(this.waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Checks if the com.danpopescu.sharesurprises.bag of surprises is empty
     * @return return true or false if the com.danpopescu.sharesurprises.bag is/is not empty.
     */
    public boolean isEmpty() {
        return this.bag.isEmpty();
    }

    /**
     * Performs an action after giving a com.danpopescu.sharesurprises.surprise.
     */
    protected abstract void giveWithPassion();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractGiveSurprises other = (AbstractGiveSurprises) o;
        return waitTime == other.waitTime &&
                Objects.equals(this.bag, other.bag);
    }

    @Override
    public int hashCode() {
        return waitTime * 31 + Objects.hashCode(this.bag);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "com.danpopescu.sharesurprises.bag=" + this.bag +
                ", waitTime=" + this.waitTime +
                '}';
    }
}
