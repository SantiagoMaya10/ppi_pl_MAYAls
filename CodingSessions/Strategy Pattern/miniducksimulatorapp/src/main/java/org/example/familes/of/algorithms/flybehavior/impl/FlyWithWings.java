package org.example.familes.of.algorithms.flybehavior.impl;

import org.example.familes.of.algorithms.flybehavior.FlyBehavior;

/**
 * FlyWithWings class that represents a concrete FlyBehavior
 */
public class FlyWithWings implements FlyBehavior {

  /**
   * fly method that prints the flying behavior
   */
  @Override
  public void fly() {
    System.out.println("I'm flying with my wings!!");
  }
}
