package bag;

import surprise.ISurprise;

/**
 * Interface that defines a standard behavior for a bag
 * of surprises.
 */
public interface IBag {

    /**
     * Adds a surprise in the bag
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
     * Removes a surprise from the bag and returns it.
     * @return a surprise from the bag
     */
    ISurprise takeOut();

    /**
     * Checks if the bag is empty or not.
     * @return true if the bag has one or more elements
     *         false if the bag has no elements
     */
    boolean isEmpty();

    /**
     * Returns the number of surprises in the bag.
     * @return the number of surprises that the bag holds
     */
    int size();
}
