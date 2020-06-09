import bag.BagFactoryOptimizeAccess;
import bag.BagTypes;
import bag.IBag;
import bag.IBagFactory;
import surprise.*;

import java.util.List;

public class TestBags {

    private static IBagFactory bagFactory = BagFactoryOptimizeAccess.getInstance();

    private static List<ISurprise> surprisesList =
            List.of(FortuneCookie.generate(), Candies.generate(), MinionToy.generate());


    public static void main(String[] args) {
        System.out.println("------------------------- put(ISurprise) -------------------------");
        IBag bag1 = bagFactory.makeBag(BagTypes.FIFO);
        bag1.put(GatherSurprises.gather());
        System.out.println(bag1);

        System.out.println("\n------------------------- put(IBag) -------------------------");
        IBag bag2 = GatherSurprises.gather(2);
        System.out.println("Bag1 before put:\n" + bag1);
        System.out.println("\nBag2 before put:\n" + bag2);

        System.out.println("\nPut Bag2 in Bag1");
        bag1.put(bag2);

        System.out.println("\nBag1 after put:\n" + bag1);
        System.out.println("\nBag2 after put:\n" + bag2);

        System.out.println("\n------------------------- size() & isEmpty() -------------------------");

        System.out.println("Size bag1: " + bag1.size());
        System.out.println("Bag1 is empty: " + bag1.isEmpty());
        System.out.println(bag1);

        System.out.println("\nSize bag2: " + bag2.size());
        System.out.println("Bag2 is empty: " + bag2.isEmpty());
        System.out.println(bag2);

        System.out.println("\n-------------------------Random Bag takeOut()-------------------------");
        testTakeOut(BagTypes.RANDOM);

        System.out.println("\n-------------------------FIFO Bag  takeOut()-------------------------");
        testTakeOut(BagTypes.FIFO);

        System.out.println("\n-------------------------LIFO Bag takeOut()-------------------------");
        testTakeOut(BagTypes.LIFO);

    }

    private static void testTakeOut(BagTypes bagType) {
        IBag bag = TestBags.bagFactory.makeBag(bagType);
        for (ISurprise surprise : TestBags.surprisesList) {
            bag.put(surprise);
        }
        System.out.println(bag + "\n");

        while (!bag.isEmpty()) {
            System.out.println(bag.takeOut());
        }
    }
}
