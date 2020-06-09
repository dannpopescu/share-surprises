package surprise;

import java.util.Objects;

/**
 * Represents a minion toy that has a certain name.
 */
public class MinionToy implements ISurprise {

    private final String name;

    private static String[] names = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};
    private static int nextMinionIndex = 0;

    public MinionToy(String name) {
        this.name = name;
    }

    /**
     * Generates a MinionToy object using the names from
     * MinionToy.names in a circular fashion.
     * @return a MinionToy object
     */
    public static MinionToy generate() {
        String name = names[nextMinionIndex++];
        if (nextMinionIndex >= names.length) {
            nextMinionIndex = 0;
        }
        return new MinionToy(name);
    }

    @Override
    public void enjoy() {
        System.out.println("A minion named " + name + " is waiting for you!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MinionToy other = (MinionToy) o;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.name);
    }

    @Override
    public String toString() {
        return "MinionToy{" +
                "name='" + this.name + '\'' +
                '}';
    }
}
