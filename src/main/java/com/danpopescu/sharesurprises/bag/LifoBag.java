package com.danpopescu.sharesurprises.bag;

import com.danpopescu.sharesurprises.surprise.ISurprise;

/**
 * A com.danpopescu.sharesurprises.bag of ISurprise elements stored in an ArrayList and
 * taken out using the 'last-in, first-out' method.
 */
public class LifoBag extends AbstractBagOptimizeAccess {

    @Override
    public ISurprise takeOut() {
        if (!this.elements.isEmpty()) {
            return this.elements.remove(this.elements.size() - 1);
        }
        return null;
    }
}
