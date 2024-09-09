package org.example.familes.of.algorithms.flybehavior.impl;

import org.example.familes.of.algorithms.flybehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I can't fly!!");
  }
}
