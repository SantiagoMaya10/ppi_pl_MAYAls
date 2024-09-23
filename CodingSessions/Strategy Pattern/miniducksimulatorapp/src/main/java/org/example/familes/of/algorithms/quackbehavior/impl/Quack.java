package org.example.familes.of.algorithms.quackbehavior.impl;

import org.example.familes.of.algorithms.quackbehavior.QuackBehavior;

/**
 * Quack class that represents a concrete QuackBehavior
 */
public class Quack implements QuackBehavior {

  /**
   * quack method that prints the quacking behavior
   */
  @Override
  public void quack() {
    System.out.println("I am quacking!!");
  }
}
