package org.example.ducks.superduck;

import org.example.familes.of.algorithms.flybehavior.impl.FlyNoWay;
import org.example.familes.of.algorithms.quackbehavior.impl.MuteQuack;

public class DecoyDuck extends Duck {

  public DecoyDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }

  @Override
  public void display() {
    System.out.println("I'm a duck Decoy");
  }
}
