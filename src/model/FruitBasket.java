package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Roland in 't Hout <r.in.t.hout@st.hanze.nl>
 * Creates a Basket (list) of fruit
 */
public class FruitBasket<F extends Fruit> {

    private List<F> contents;

    public FruitBasket() {
        contents = new ArrayList<>();
    }

    public void add(F fruit) {
        contents.add(fruit);
    }

    public boolean contains(F fruit) {
        return contents.contains(fruit);
    }

    public boolean isEmpty() {
        return contents.isEmpty();
    }

    public int size() {
        return contents.size();
    }

    @Override
    public String toString() {
        return contents.toString();
    }
} // end of class FruitBasket
