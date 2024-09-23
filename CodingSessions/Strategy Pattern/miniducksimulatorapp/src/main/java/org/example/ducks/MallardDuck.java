package org.example.ducks;

import org.example.ducks.superduck.Duck;
import org.example.familes.of.algorithms.flybehavior.impl.FlyWithWings;
import org.example.familes.of.algorithms.quackbehavior.impl.Quack;

/**
 * MallardDuck class that represents a concrete Duck
 */
public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  /**
   * Display method that prints the duck type
   */
  @Override
  public void display() {
    System.out.println("I'm a real Mallard duck!!");
  }
}
