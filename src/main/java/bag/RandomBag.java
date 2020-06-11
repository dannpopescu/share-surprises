package bag;

import surprise.ISurprise;

import java.util.Random;

/**
 * A bag of ISurprise elements stored in an ArrayList and
 * taken out at random.
 */
public class RandomBag extends AbstractBagOptimizeAccess {

    private static final Random random = new Random();

    @Override
    public ISurprise takeOut() {
        if (!this.elements.isEmpty()) {
            int randomIndex = RandomBag.random.nextInt(this.elements.size());
            return this.elements.remove(randomIndex);
        }
        return null;
    }
}
