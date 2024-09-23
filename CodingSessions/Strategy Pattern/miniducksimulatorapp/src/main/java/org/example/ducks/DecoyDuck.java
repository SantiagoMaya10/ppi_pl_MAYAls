package org.example.ducks;

import org.example.ducks.superduck.Duck;
import org.example.familes.of.algorithms.flybehavior.impl.FlyNoWay;
import org.example.familes.of.algorithms.quackbehavior.impl.MuteQuack;

/**
 * DecoyDuck class that represents a concrete Duck
 */
public class DecoyDuck extends Duck {

  public DecoyDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }

  /**
   * Display method that prints the duck type
   * and is overriden from the Duck class
   */
  @Override
  public void display() {
    System.out.println("I'm a duck Decoy");
  }
}
