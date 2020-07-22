package com.danpopescu.sharesurprises.bag;

import com.danpopescu.sharesurprises.surprise.ISurprise;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Implements the IBag behavior using an ArrayList, thus optimizing
 * for accessing the elements.
 */
public abstract class AbstractBagOptimizeAccess implements IBag {

    protected ArrayList<ISurprise> elements = new ArrayList<>();

    @Override
    public void put(ISurprise newSurprise) {
        this.elements.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while (!bagOfSurprises.isEmpty()) {
            this.elements.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    @Override
    public int size() {
        return this.elements.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        AbstractBagOptimizeAccess other = (AbstractBagOptimizeAccess) o;
        return Objects.equals(this.elements, other.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.elements);
    }

    @Override
    public String toString() {
        // create a char sequence representing the elements in this com.danpopescu.sharesurprises.bag,
        // where each element is indented on a new line
        StringBuilder sb = new StringBuilder();
        for (ISurprise surprise : this.elements) {
            sb.append("\n\t").append(surprise).append(",");
        }

        // delete the last comma
        if (!this.elements.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return this.getClass().getSimpleName() + "{" +
                "elements=" + sb.toString() +
                '}';
    }
}
