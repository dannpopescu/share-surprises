import bag.IBag;
import surprise.*;

public class TestSurprises {

    public static void main(String[] args) {
        System.out.println("---------------------- FortuneCookies.generate() ----------------------");
        for (int i = 0; i < 10; i++) {
            ISurprise surprise = FortuneCookie.generate();
            System.out.print(surprise + "\n\t");
            surprise.enjoy();
        }
        System.out.println();

        System.out.println("---------------------- Candies.generate() ----------------------");
        for (int i = 0; i < 10; i++) {
            ISurprise surprise = Candies.generate();
            System.out.print(surprise + "\n\t");
            surprise.enjoy();
        }
        System.out.println();

        System.out.println("---------------------- MinionToy.generate() ----------------------");
        for (int i = 0; i < 10; i++) {
            ISurprise surprise = MinionToy.generate();
            System.out.print(surprise + "\n\t");
            surprise.enjoy();
        }

        System.out.println("\n----------------------GatherSurprises.gather----------------------");

        ISurprise surprise = GatherSurprises.gather();
        System.out.print(surprise + "\n\t");
        surprise.enjoy();

        IBag bag = GatherSurprises.gather(20);
        while (!bag.isEmpty()) {
            surprise = bag.takeOut();
            System.out.print(surprise + "\n\t");
            surprise.enjoy();
        }
    }
}
