package com.danpopescu.sharesurprises.bag;

import com.danpopescu.sharesurprises.surprise.ISurprise;

/**
 * Interface that defines a standard behavior for a com.danpopescu.sharesurprises.bag
 * of surprises.
 */
public interface IBag {

    /**
     * Adds a com.danpopescu.sharesurprises.surprise in the com.danpopescu.sharesurprises.bag
     * @param newSurprise to be added
     */
    void put(ISurprise newSurprise);

    /**
     * Adds all the surprises from another IBag.
     * The 'bagOfSurprises' will be empty afterwards.
     * @param bagOfSurprises from which to add the surprises
     */
    void put(IBag bagOfSurprises);

    /**
     * Removes a com.danpopescu.sharesurprises.surprise from the com.danpopescu.sharesurprises.bag and returns it.
     * @return a com.danpopescu.sharesurprises.surprise from the com.danpopescu.sharesurprises.bag
     */
    ISurprise takeOut();

    /**
     * Checks if the com.danpopescu.sharesurprises.bag is empty or not.
     * @return true if the com.danpopescu.sharesurprises.bag has one or more elements
     *         false if the com.danpopescu.sharesurprises.bag has no elements
     */
    boolean isEmpty();

    /**
     * Returns the number of surprises in the com.danpopescu.sharesurprises.bag.
     * @return the number of surprises that the com.danpopescu.sharesurprises.bag holds
     */
    int size();
}
