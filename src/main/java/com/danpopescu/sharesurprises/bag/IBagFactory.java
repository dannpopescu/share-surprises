package com.danpopescu.sharesurprises.bag;

/**
 * Defines a standard behavior for a factory
 * of IBag objects.
 */
public interface IBagFactory {

    /**
     * Creates a new com.danpopescu.sharesurprises.bag of the specified type. The com.danpopescu.sharesurprises.bag types can be
     * any of the constants defined in the BagTypes enum: {RANDOM,
     * FIFO, LIFO}
     * @param type a BagTypes constant that defines a type of bags
     * @return an IBag of the specified type
     */
    IBag makeBag(BagTypes type);
}
