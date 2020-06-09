package bag;

import surprise.ISurprise;

/**
 * A bag of ISurprise elements stored in an ArrayList and
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
