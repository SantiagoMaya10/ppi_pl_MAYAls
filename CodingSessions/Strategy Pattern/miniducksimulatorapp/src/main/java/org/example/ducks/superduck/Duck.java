package org.example.ducks.superduck;

import org.example.familes.of.algorithms.flybehavior.FlyBehavior;
import org.example.familes.of.algorithms.quackbehavior.QuackBehavior;

/**
 * Duck class that represents a super class for all ducks
 */
public abstract class Duck {
  public FlyBehavior flyBehavior;
  public QuackBehavior quackBehavior;

  public Duck() {
  }

  /**
   * Display method that prints the duck type
   */
  public abstract void display();

  /**
   * Method that calls the fly method from the FlyBehavior interface
   */
  public void performFly() {
    flyBehavior.fly();
  }

  /**
   * Method that calls the quack method from the QuackBehavior interface
   */
  public void performQuack() {
    quackBehavior.quack();
  }

  /**
   * Method that prints a message that all ducks can swim
   */
  public void swim() {
    System.out.println("Every duck floats! Even decoy ones...");
  }

}
