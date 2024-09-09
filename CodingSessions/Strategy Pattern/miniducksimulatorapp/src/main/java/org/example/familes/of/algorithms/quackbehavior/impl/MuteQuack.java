package org.example.familes.of.algorithms.quackbehavior.impl;

import org.example.familes.of.algorithms.quackbehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("I can't quack!!");
  }
}
