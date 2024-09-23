package org.example.familes.of.algorithms.flybehavior.impl;

import org.example.familes.of.algorithms.flybehavior.FlyBehavior;

/**
 * FlyNoWay class that represents a concrete FlyBehavior
 */
public class FlyNoWay implements FlyBehavior {

  /**
   * fly method that prints the flying behavior
   */
  @Override
  public void fly() {
    System.out.println("I can't fly!!");
  }
}
