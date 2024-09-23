package org.example.ducks;

import org.example.ducks.superduck.Duck;
import org.example.familes.of.algorithms.flybehavior.impl.FlyNoWay;
import org.example.familes.of.algorithms.quackbehavior.impl.Squeak;

/**
 * RubberDuck class that represents a concrete Duck
 */
public class RubberDuck extends Duck {

  public RubberDuck() {
    quackBehavior = new Squeak();
    flyBehavior = new FlyNoWay();
  }

  /**
   * Display method that prints the duck type
   */
  public void display() {
    System.out.println("I'm a rubber duckie");
  }
}
