package org.example.ducks.superduck;

import org.example.familes.of.algorithms.flybehavior.FlyBehavior;
import org.example.familes.of.algorithms.quackbehavior.QuackBehavior;

public abstract class Duck {
  public FlyBehavior flyBehavior;
  public QuackBehavior quackBehavior;

  public Duck() {
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void swim() {
    System.out.println("Every duck floats! Even decoy ones...");
  }

}
