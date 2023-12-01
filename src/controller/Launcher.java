package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;


public class Launcher {

    public static void main(String[] args) {
       // TODO Try and use the FruitBasket class for different kind of fruits and also for a mix of fruits
        FruitBasket<Apple> appleFruitBasket = new FruitBasket<>();
        FruitBasket<Banana> bananaFruitBasket = new FruitBasket<>();
        FruitBasket<Pear> pearFruitBasket = new FruitBasket<>();
        FruitBasket<Fruit> fruitBasket = new FruitBasket<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();

        appleFruitBasket.add(apple1);
        appleFruitBasket.add(apple2);

        Banana banana1 = new Banana();
        Banana banana2 = new Banana();

        bananaFruitBasket.add(banana1);
        bananaFruitBasket.add(banana2);

        Pear pear1 = new Pear();
        Pear pear2 = new Pear();

        pearFruitBasket.add(pear1);
        pearFruitBasket.add(pear2);

        fruitBasket.add(apple1);
        fruitBasket.add(apple2);
        fruitBasket.add(banana1);
        fruitBasket.add(pear1);

        System.out.println(appleFruitBasket);
        System.out.println(bananaFruitBasket);
        System.out.println(pearFruitBasket);
        System.out.println(fruitBasket);


    }
}