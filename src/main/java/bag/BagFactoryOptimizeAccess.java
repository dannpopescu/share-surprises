package bag;

/**
 * Creates IBags that use ArrayLists as their storage mechanism.
 */
public final class BagFactoryOptimizeAccess implements IBagFactory {

    private static BagFactoryOptimizeAccess instance;

    private BagFactoryOptimizeAccess() {
    }

    @Override
    public IBag makeBag(BagTypes type) {
        switch (type) {
            case FIFO: return new FifoBag();
            case LIFO: return new LifoBag();
            default: return new RandomBag();
        }
    }

    /**
     * Returns the instance of this factory.
     * @return the only instance of this class
     */
    public static BagFactoryOptimizeAccess getInstance() {
        if (BagFactoryOptimizeAccess.instance == null) {
            BagFactoryOptimizeAccess.instance = new BagFactoryOptimizeAccess();
        }
        return BagFactoryOptimizeAccess.instance;
    }
}
