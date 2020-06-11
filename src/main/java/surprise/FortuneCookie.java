package surprise;

import java.util.Objects;
import java.util.Random;

/**
 * Represents a fortune cookie with a symbolic message inside.
 */
public class FortuneCookie implements ISurprise {

    private String message;

    private static final Random random = new Random();
    private static final String[] quotes = {
            "A ship in harbor is safe, but that's not why ships are built.",
            "The real kindness comes from within you.",
            "The usefulness of a cup is in its emptiness.",
            "He who throws mud loses ground.",
            "To avoid criticism, do nothing, say nothing, be nothing.",
            "One that would have the fruit must climb the tree.",
            "Big journeys begin with a single step.",
            "Of all our human resources, the most precious is the desire to improve.",
            "Do the thing you fear and the death of fear is certain.",
            "People learn little from success, but much from failure.",
            "We must always have old memories and young hopes.",
            "He who expects no gratitude shall never be disappointed.",
            "I hear and I forget. I see and I remember. I do and I understand.",
            "It’s amazing how much good you can do if you don’t care who gets the credit.",
            "Never forget that a half truth is a whole lie.",
            "Happiness isn’t an outside job, it’s an inside job.",
            "The joyfulness of a man prolongeth his days.",
            "It takes more than good memory to have good memories.",
            "You find beauty in ordinary things, do not lose this ability.",
            "May life throw you a pleasant curve."
    };

    public FortuneCookie(String message) {
        this.message = message;
    }

    /**
     * Generates an instance of this class using a random quote
     * from FortuneCookie.quotes.
     * @return a FortuneCookie object with a random message
     */
    public static FortuneCookie generate() {
        int randomIndex = FortuneCookie.random.nextInt(FortuneCookie.quotes.length);
        return new FortuneCookie(FortuneCookie.quotes[randomIndex]);
    }

    @Override
    public void enjoy() {
        System.out.println(this.message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        FortuneCookie other = (FortuneCookie) o;
        return Objects.equals(this.message, other.message);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.message);
    }

    @Override
    public String toString() {
        return "FortuneCookie{" +
                "message='" + this.message + '\'' +
                '}';
    }
}
