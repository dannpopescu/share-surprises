package surprise;

import java.util.Objects;
import java.util.Random;

/**
 * Represents a number of candies of a certain type.
 */
public class Candies implements ISurprise {

    private String type;
    private int quantity;

    private static String[] types = {"chocolate", "jelly", "fruits", "vanilla", "caramel"};
    private static Random random = new Random();

    public Candies(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    /**
     * Generates a Candies object with a random quantity in the
     * interval [10, 50] and a random type from {chocolate, jelly,
     * fruits, vanilla, caramel}.
     * @return a Candies object with a random quantity and type
     */
    public static Candies generate() {
        int typeIndex = Candies.random.nextInt(Candies.types.length);
        int quantity = Candies.random.nextInt(41) + 10;
        return new Candies(Candies.types[typeIndex], quantity);
    }

    @Override
    public void enjoy() {
        System.out.println(this.quantity + " " + this.type + " candies are waiting for you!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Candies other = (Candies) o;
        return this.quantity == other.quantity &&
                Objects.equals(this.type, other.type);
    }

    @Override
    public int hashCode() {
        return this.quantity * 31 + Objects.hashCode(this.type);
    }

    @Override
    public String toString() {
        return "Candies{" +
                "type='" + this.type + '\'' +
                ", quantity=" + this.quantity +
                '}';
    }
}
