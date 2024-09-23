package org.example;

import org.example.ducks.MallardDuck;
import org.example.ducks.RubberDuck;
import org.example.ducks.DecoyDuck;
import org.example.ducks.superduck.Duck;

/**
 * App class that represents the main class
 */
public class App {
  /**
   * Main method that represents the entry point of the application
   * @param args
   */
  public static void main(String[] args) {

    // Create a MallardDuck object
    Duck mallard = new MallardDuck();

    // Call the display method and the performFly and performQuack methods
    mallard.display();
    mallard.performFly();
    mallard.performQuack();

    System.out.println("-----");

    // Create a RubberDuck object
    Duck rubberDuckie = new RubberDuck();

    // Call the display method and the performFly and performQuack methods
    rubberDuckie.display();
    rubberDuckie.performFly();
    rubberDuckie.performQuack();

    System.out.println("-----");

    // Create a DecoyDuck object
    Duck decoyDuck = new DecoyDuck();

    // Call the display method and the performFly and performQuack methods
    decoyDuck.display();
    decoyDuck.performFly();
    decoyDuck.performQuack();

  }
}
