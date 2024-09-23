package org.example.familes.of.algorithms.quackbehavior.impl;

import org.example.familes.of.algorithms.quackbehavior.QuackBehavior;

/**
 * MuteQuack class that represents a concrete QuackBehavior
 */
public class MuteQuack implements QuackBehavior {

  /**
   * quack method that prints the quacking behavior
   */
  @Override
  public void quack() {
    System.out.println("I can't quack!!");
  }
}
