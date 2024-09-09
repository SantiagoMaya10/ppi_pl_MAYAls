package org.example;

import org.example.ducks.MallardDuck;
import org.example.ducks.RubberDuck;
import org.example.ducks.superduck.DecoyDuck;
import org.example.ducks.superduck.Duck;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();

    mallard.display();
    mallard.performFly();
    mallard.performQuack();

    System.out.println("-----");

    Duck rubberDuckie = new RubberDuck();
    rubberDuckie.display();
    rubberDuckie.performFly();
    rubberDuckie.performQuack();

    System.out.println("-----");

    Duck decoyDuck = new DecoyDuck();

    decoyDuck.display();
    decoyDuck.performFly();
    decoyDuck.performQuack();

  }
}
