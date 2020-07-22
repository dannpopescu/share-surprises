package com.danpopescu.sharesurprises.bag;

import com.danpopescu.sharesurprises.surprise.ISurprise;

/**
 * A com.danpopescu.sharesurprises.bag of ISurprise elements stored in an ArrayList and
 * taken out using the 'first-in, first-out' method.
 */
public class FifoBag extends AbstractBagOptimizeAccess {

    @Override
    public ISurprise takeOut() {
        if (!this.elements.isEmpty()) {
            return this.elements.remove(0);
        }
        return null;
    }
}
